/*
* This file is part of rasdaman community.
*
* Rasdaman community is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* Rasdaman community is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with rasdaman community.  If not, see <http://www.gnu.org/licenses/>.
*
* Copyright 2003, 2004, 2005, 2006, 2007, 2008, 2009 Peter Baumann /
rasdaman GmbH.
*
* For more information please see <http://www.rasdaman.org>
* or contact Peter Baumann via <baumann@rasdaman.com>.
*/
/**
 * SOURCE: alignedtiling.cc
 *
 * MODULE: rasodmg
 * CLASS:  r_AlignedTiling, r_DefaultTiling
 *
 * COMMENTS:
 *          None
*/

#include "config.h"
#include <vector>
#include <math.h>
#include <cstring>
#include <cstdlib>

#include "rasodmg/alignedtiling.hh"
#include "raslib/rminit.hh"

#include <logging.hh>

#include <sstream>

const char*
r_Aligned_Tiling::description = "tile configuration or tile dimension and tile size (in bytes) (ex: \"[0:9,0:9];100\" or \"2;100\")";

r_Aligned_Tiling::r_Aligned_Tiling(const char* encoded) throw (r_Error)
    :   r_Dimension_Tiling(0, 0)
{

    if (!encoded)
    {
        LFATAL << "r_Aligned_Tiling::r_Aligned_Tiling(" << (encoded ? encoded : "NULL") << ")";
        throw r_Error(TILINGPARAMETERNOTCORRECT);
    }

    r_Bytes tileS = 0, lenToConvert = 0;
    r_Minterval* tileConf = NULL;
    r_Dimension tileD = 0;
    bool state = false; //false for "tileconf;tilesize", true for "tiledim,tilesize"
    const char* pStart = NULL, *pRes = NULL, *pEnd = NULL;
    char* pToConvert = NULL;
    pStart = encoded;
    pEnd = pStart + strlen(pStart);
    pRes = strstr(pStart, TCOLON);
    if (!pRes)
    {
        LFATAL << "r_Aligned_Tiling::r_Aligned_Tiling(" << encoded << "): Error decoding tile configuration from tilingparams.";
        throw r_Error(TILINGPARAMETERNOTCORRECT);
    }

//deal with first param
    lenToConvert = pRes - pStart;
    pToConvert = new char[lenToConvert + 1];
    memcpy(pToConvert, pStart, lenToConvert);
    pToConvert[lenToConvert] = '\0';

    if (*pToConvert == *LSQRBRA)
    {
        try
        {
            tileConf = new r_Minterval(pToConvert);
        }
        catch (r_Error& err)
        {
            LFATAL << "r_Aligned_Tiling::r_Aligned_Tiling(" << encoded << "): Error decoding tile configuration \"" << pToConvert << "\" from tileparams.";
            LFATAL << "Error " << err.get_errorno() << " : " << err.what();
            delete [] pToConvert;
            throw r_Error(TILINGPARAMETERNOTCORRECT);
        }
    }
    else
    {
        tileD = strtol(pToConvert, (char**)NULL, DefaultBase);
        if (!tileD)
        {
            LFATAL << "r_Aligned_Tiling::r_Aligned_Tiling(" << encoded << "): Error decoding tile dimension \"" << pToConvert << "\" from tileparams.";
            delete[] pToConvert;
            throw r_Error(TILINGPARAMETERNOTCORRECT);
        }
    }

//skip COLON
    delete[] pToConvert;
    if (pRes != (pEnd - 1))
    {
        pRes++;
    }
    else
    {
        LFATAL << "r_Aligned_Tiling::r_Aligned_Tiling(" << encoded << "): Error decoding tiling, end of stream.";
        throw r_Error(TILINGPARAMETERNOTCORRECT);
    }

//deal with second param
    tileS = strtol(pRes, (char**) NULL, DefaultBase);
    if (!tileS)
    {
        LFATAL << "r_Aligned_Tiling::r_Aligned_Tiling(" << encoded << "): Error decoding tile size \"" << pRes << "\".";

        if (tileConf)
        {
            delete tileConf;
        }

        throw r_Error(TILINGPARAMETERNOTCORRECT);
    }

//detect state
    if (tileConf)
    {
        tile_config = *tileConf;
        dimension = tile_config.dimension();
        tile_size = tileS;
        delete tileConf;
    }
    else
    {
        tile_config = r_Minterval(tileD);
        dimension = tileD;
        tile_size = tileS;
    }

}

r_Aligned_Tiling::r_Aligned_Tiling(r_Dimension dim, r_Bytes ts) throw (r_Error)
    :   r_Dimension_Tiling(dim, ts),
        tile_config(dim)
{
    /// Default tile configuration - equal sides
    for (r_Dimension i = 0; i < dim ; i++)
    {
        tile_config << r_Sinterval((r_Range)0, (r_Range)1);
    }
}

r_Aligned_Tiling::r_Aligned_Tiling(const r_Minterval& tc, r_Bytes ts) throw (r_Error)
    :   r_Dimension_Tiling(tc.dimension(), ts),
        tile_config(tc)
{
}

r_Tiling*
r_Aligned_Tiling::clone() const
{
    r_Aligned_Tiling* newAT = new r_Aligned_Tiling(tile_config, tile_size);
    return newAT;
}

r_Aligned_Tiling::~r_Aligned_Tiling()
{
    tile_config.r_deactivate();
}

const r_Minterval&
r_Aligned_Tiling::get_tile_config() const
{
    return tile_config;
}

r_Minterval
r_Aligned_Tiling::compute_tile_domain(const r_Minterval& dom, r_Bytes cell_size) const
{
    // Minimum optimal tile size. Below this value, the waste will be too big.
    r_Bytes optMinTileSize = get_min_opt_tile_size();

    // number of cells per tile according to storage options
    r_Area numCellsTile = tile_size / cell_size;

    // For final result.
    r_Minterval tileDomain(dimension);

    int startIx = -1;

    for (r_Dimension i = 0; i < dimension ; i++)
    {
        if (tile_config[i].is_low_fixed() == 0  ||
                tile_config[i].is_high_fixed() == 0)
        {
            startIx = static_cast<int>(i);
        }
    }
    if (startIx >= 0) // Some limits are nonfixed
    {
        unsigned long size = cell_size;
        int i;

        for (i = startIx; i >= 0 ; i--) // treat the non fixed limits first
        {
            r_Range l, h;

            // If any of the limits is non-fixed along this direction, tiles
            // will extend from one side to the other along this direction.
            if ((tile_config[static_cast<r_Dimension>(i)].is_low_fixed() == 0) ||
                    (tile_config[static_cast<r_Dimension>(i)].is_high_fixed() == 0))
            {

                l = dom[static_cast<r_Dimension>(i)].low();
                h = dom[static_cast<r_Dimension>(i)].high();

                /*
                   Alternative interpretation of tile_config with non fixed limits
                For the time being is useless because the splittile algorithm
                doesn't take into account the origin of the tile
                    if (tile_config[i].is_low_fixed() == 0)
                      l = contentsDomain[i].low();
                    else
                  l = tile_config[i].low();
                    if (tileconfig[i].is_high_fixed() == 0)
                      h = contentsDomain[i].high();
                    else
                      h = tile_config[i].high();
                    */

                if (size * static_cast<unsigned long>(h - l + 1) > tile_size)
                {
                    h = static_cast<r_Range>(tile_size / size) + l  - 1;
                }
                size = size * static_cast<unsigned long>(h - l + 1);
                tileDomain[static_cast<r_Dimension>(i)] = r_Sinterval(r_Range(l) , r_Range(h));
            }
        }
        for (i = static_cast<int>(dimension) - 1; i >= 0 ; i--) // treat fixed limits now
        {
            r_Range l, h;

            // If any of the limits is non-fixed along this direction, tiles
            // will extend from one side to the other along this direction.
            if ((tile_config[static_cast<r_Dimension>(i)].is_low_fixed() != 0) &&
                    (tile_config[static_cast<r_Dimension>(i)].is_high_fixed() != 0))
            {
                l = tile_config[static_cast<r_Dimension>(i)].low();
                h = tile_config[static_cast<r_Dimension>(i)].high();

                if (static_cast<r_Bytes>(size) * (h - l + 1) > tile_size)
                {
                    h = static_cast<r_Range>(tile_size / size) + l  - 1;
                }
                size = size * static_cast<unsigned long>(h - l + 1);
                tileDomain[static_cast<r_Dimension>(i)] = r_Sinterval(r_Range(l) , r_Range(h));
            }
        }

        return tileDomain;
    }
    else    // tile_config has only fixed limits
    {
        unsigned long numCellsTileConfig = tile_config.cell_count();
        unsigned long sizeTileConfig = numCellsTileConfig * cell_size;

        if (sizeTileConfig > get_min_opt_tile_size() && sizeTileConfig < tile_size)
        {
            return tile_config;
        }
        else
        {
            float sizeFactor = (float) numCellsTile / numCellsTileConfig;

            float f = float (1 / float(dimension));
            float dimFactor = (float)pow(sizeFactor, f);
            LTRACE << "dim factor == " << dimFactor;

            unsigned long l, h;
            unsigned long newWidth;

            // extending the bound of each r_Sinterval of tile_config by
            // using the factor dimFactor
            for (unsigned int i = 0; i < dimension ; i++)
            {
                l = static_cast<unsigned long>(tile_config[i].low());
                h = static_cast<unsigned long>(tile_config[i].high());
                newWidth = (unsigned long)((h - l + 1) * dimFactor);
                if (newWidth < 1)
                {
                    newWidth = 1;
                }
                tileDomain << r_Sinterval(r_Range(l), r_Range(l + newWidth - 1));
            }

            // Approximate the resulting tile size to the target one:

            /*
            r_Minterval tmpTileDomain =
            get_opt_size(tileDomain, cell_size);
                tileDomain = tmpTileDomain;
                */

            /*
                  unsigned long sz = tileDomain.cell_count() * cell_size;

                  LTRACE << "cell_size " << cell_size << " tileDomain "<< tileDomain;
                  LTRACE << "cell_count == " << tileDomain.cell_count() << " sz == " << sz;

                  unsigned long newSz = sz;
                  for(i = dimension-1; i >= 0 && newSz < tile_size ; i--)
                  {
                LTRACE << "inside the cycle ";
                unsigned long deltaSz = cell_size;
                for (int j = 0 ; j < dimension ; j++)
                 if (j != i)
                   deltaSz *= (tileDomain[j].high()-tileDomain[j].low()+1);

                h = tileDomain[i].high();
                if (deltaSz + newSz <= tile_size)
                {
                  tileDomain[i].set_high(r_Range(h + 1));
                  newSz += deltaSz;
                }
                  }
            */

            if (tileDomain.cell_count() * cell_size > tile_size)
            {
                LTRACE << "calculateTileDomain() ";
            }
            if (tileDomain.cell_count() * cell_size < optMinTileSize)
            {
                LTRACE << "calculateTileDomain() result non optimal ";
            }

            // cout << "return 3"<<std::endl;
            return tileDomain;
        }
    }
}

std::vector<r_Minterval>*
r_Aligned_Tiling::compute_tiles(const r_Minterval& obj_domain, r_Bytes cell_size) const throw (r_Error)
{
    std::vector<r_Minterval>* result = new std::vector<r_Minterval>;

    r_Dimension dim = tile_config.dimension();

    r_Minterval bigDom = obj_domain;

    r_Minterval tileDom = compute_tile_domain(obj_domain, cell_size);

    // cout << "r_Aligned_Tiling::compute_tiles() " << tileDom << std::endl;

    r_Minterval currDom(tileDom.dimension());
    r_Point cursor(tileDom.dimension());
    r_Point tileSize;
    r_Point origin;
    int done = 0;

    // initialize cursor
    for (dim = 0; dim < cursor.dimension(); dim++)
    {
        cursor[dim] = 0;
    }

    // calculate size of Tiles
    tileSize = tileDom.get_extent();

    // origin of bigTile
    origin = bigDom.get_origin();

    // initialize currDom
    for (dim = 0; dim < cursor.dimension(); dim++)
    {
        currDom << r_Sinterval((r_Range)(origin[dim]), (r_Range)(origin[dim] + tileSize[dim] - 1));
    }
    // resets tileDom to lower left side of bigTile
    tileDom = currDom;

    // intersect with bigTile
    currDom.intersection_with(bigDom);

    // iterate with smallTile over bigTile
    while (!done)
    {
        currDom.intersection_with(bigDom);

        // create new smallTile
        r_Minterval smallTile(dim);

        smallTile = currDom;

        // insert tile in set
        result->push_back(smallTile);

        // increment cursor, start with highest dimension
        long i = cursor.dimension() - 1;
        cursor[(unsigned int)i] += tileSize[(unsigned int)i];
        // move cursor
        currDom = tileDom.create_translation(cursor);
        while (!(currDom.intersects_with(bigDom)))
        {
            cursor[(unsigned int)i] = 0;
            i--;
            if (i < 0)
            {
                done = 1;
                break;
            }
            cursor[(unsigned int)i] += tileSize[(unsigned int)i];
            // move cursor
            currDom = tileDom.create_translation(cursor);
        }
    }
    return result;
}

r_Minterval
r_Aligned_Tiling::get_opt_size(const r_Minterval& tileDomain, r_Bytes cellSize) const
{

    unsigned long tileSize = get_tile_size();
    unsigned long newSize = tileDomain.cell_count() * cellSize;
    r_Minterval result = tileDomain;
    r_Dimension dim = tileDomain.dimension();
    int* ixArr = new int[dim];
    r_Minterval tmpResult = result;
    int j;

    for (j = 0; j < static_cast<int>(dim); j++)
    {
        ixArr[j] = j;
    }

    for (j = static_cast<int>(dim) - 1; j >= 0 && newSize < tileSize ; j--)
    {
        int i = 0;
        unsigned long h, wd;
        unsigned int minWidthIx = 0;
        unsigned long minWidth = static_cast<unsigned long>(tileDomain[0].high() - tileDomain[0].low() + 1);
        for (int k = j; k >= 0 ; k--)
        {
            i = ixArr[k];

            h = static_cast<unsigned long>(result[static_cast<r_Dimension>(i)].high() + 1);
            wd = static_cast<unsigned long>(result[static_cast<r_Dimension>(i)].high() - result[static_cast<r_Dimension>(i)].low() + 1);
            if (wd < minWidth)
            {
                minWidth = wd;
                minWidthIx = static_cast<unsigned int>(i);
            }
        }

        int tmpIx = ixArr[j];
        ixArr[minWidthIx] = tmpIx;

        tmpResult[minWidthIx].set_high(r_Range(h));
        newSize = tmpResult.cell_count() * cellSize;
        if (newSize > tileSize)
        {
            for (i = static_cast<int>(dim) - 1; i >= 0 ; i--)
            {
                h = static_cast<unsigned long>(result[static_cast<r_Dimension>(i)].high() + 1);
                wd = static_cast<unsigned long>(result[static_cast<r_Dimension>(i)].high() - result[static_cast<r_Dimension>(i)].low() + 1);
                if (wd < minWidth)
                {
                    minWidth = wd;
                    minWidthIx = static_cast<unsigned int>(i);
                }
            }
        }

        result[minWidthIx].set_high(r_Range(h));
        newSize = result.cell_count() * cellSize;
        if (newSize > tileSize)
        {
            result[minWidthIx].set_high(r_Range(h - 1));
        }
    }
    delete[] ixArr;
    ixArr = NULL;
    return result;
}

r_Tiling_Scheme
r_Aligned_Tiling::get_tiling_scheme() const
{
    return r_AlignedTiling;
}

r_Bytes
r_Aligned_Tiling::get_min_opt_tile_size() const
{
    return (get_tile_size() - get_tile_size() / 10);
}

char*
r_Aligned_Tiling::get_string_representation() const
{

    // initialize string stream
    std::ostringstream domainStream;

    // write into string stream

    print_status(domainStream);

    // allocate memory taking the final string
    char* returnString = strdup(domainStream.str().c_str());


    return returnString;
}

void
r_Aligned_Tiling::print_status(std::ostream& os) const
{
    os << "r_Aligned_Tiling[ ";
    r_Dimension_Tiling::print_status(os);
    os << " tile configuration = " << tile_config << " ]";
}

/*
std::ostream&
operator<<(std::ostream& s, const r_Aligned_Tiling& at)
{
  at.print_status(s);
  return s;
}
*/

/*
std::vector<r_Minterval>*
r_Default_Tiling::compute_tiles(const r_Minterval& obj_domain, long cell_size)
  const
{
  std::vector<r_Minterval>* result = new std::vector<r_Minterval>;

  r_Minterval bigDom = obj_domain;

  r_Minterval tileDom(bigDom.dimension());

  // compute the domain of the small tiles
  // tiles are n-dimensional cubes with edge length n-th root of max tile size
  //old implementations:
  //long edgeLength = (long)floor(exp((1/(double)tileDom.dimension())*
    //          log(RMInit::tileSize/mar->get_type_length())));
  //long edgeLength = (long)floor(exp((1/(double)tileDom.dimension())*
    //          log(get_tile_size()/cell_size)));

  LTRACE << "tile size == " << get_tile_size();
  long edgeLength = (long) floor(pow(get_tile_size()/cell_size,
                          1/(double)tileDom.dimension()));
  r_Dimension dim;

  for(dim=0; dim<tileDom.dimension(); dim++)
    tileDom << r_Sinterval((r_Range)0, (r_Range)edgeLength-1);

  r_Minterval currDom(tileDom.dimension());
  r_Point cursor(tileDom.dimension());
  r_Point tileSize;
  r_Point origin;
  int done = 0;

  // initialize cursor
  for(dim = 0; dim < cursor.dimension(); dim++)
    cursor[dim] = 0;

  // calculate size of Tiles
  tileSize = tileDom.get_extent();

  // origin of bigTile
  origin = bigDom.get_origin();

  // initialize currDom
  for(dim=0; dim < cursor.dimension(); dim++)
    currDom << r_Sinterval((r_Range) (origin[dim]), (r_Range) (origin[dim] + tileSize[dim] - 1));
  // resets tileDom to lower left side of bigTile
  tileDom = currDom;

  // intersect with bigTile
  currDom.intersection_with(bigDom);

  // iterate with smallTile over bigTile
  while(!done)
  {
    currDom.intersection_with(bigDom);

    // create new smallTile
    r_Minterval smallTile(dim);

    smallTile = currDom;

    // insert tile in set
    result->push_back(smallTile);

    // increment cursor, start with highest dimension
    long i = cursor.dimension() - 1;
    cursor[(unsigned int)i] += tileSize[(unsigned int)i];
    // move cursor
    currDom = tileDom.create_translation(cursor);
    while(!(currDom.intersects_with(bigDom)))
    {
      cursor[(unsigned int)i] = 0;
      i--;
      if(i < 0)
      {
    done = 1;
    break;
      }
      cursor[(unsigned int)i] += tileSize[(unsigned int)i];
      // move cursor
      currDom = tileDom.create_translation(cursor);
    }
  }
  return result;
}
*/
