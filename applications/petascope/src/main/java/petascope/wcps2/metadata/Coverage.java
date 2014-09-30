package petascope.wcps2.metadata;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import petascope.wcps.metadata.CoverageInfo;

/**
 * Simple wrapper around the coverage metadata petascope class
 *
 * @author <a href="mailto:alex@flanche.net">Alex Dumitru</a>
 * @author <a href="mailto:vlad@flanche.net">Vlad Merticariu</a>
 */
public class Coverage {

    /**
     * Constructor for the class for coverages that sit in the database
     *
     * @param coverageName the name of the coverage
     * @param metadata     the metadata of the  coverage
     */
    public Coverage(@NotNull String coverageName, @NotNull CoverageInfo metadata) {
        this.coverageName = coverageName;
        this.metadata = metadata;
    }

    public Coverage(@NotNull String coverageName) {
        this.coverageName = coverageName;
    }

    /**
     * Returns the name of the coverage
     *
     * @return the name of the coverage
     */
    @NotNull
    public String getCoverageName() {
        return coverageName;
    }

    /**
     * Returns the metadata of the coverage
     *
     * @return the coverage metadata
     */
    @Nullable
    public CoverageInfo getMetadata() {
        return metadata;
    }

    /**
     * Determines if the coverage is compatible with a new given coverage
     *
     * @param coverage the coverage to be compared with
     * @return true if compatible, false otherwise
     */
    public boolean isCompatibleWith(@NotNull Coverage coverage) {
        if (this == DEFAULT_COVERAGE || coverage == DEFAULT_COVERAGE) {
            return true;
        }
        return metadata.isCompatible(coverage.getMetadata());
    }

    private String coverageName;
    private String coverageCrs;
    private CoverageInfo metadata;
    public static Coverage DEFAULT_COVERAGE = new Coverage("$$DEFAULT_COVERAGE$$");
}