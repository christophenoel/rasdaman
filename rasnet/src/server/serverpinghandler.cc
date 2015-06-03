/*
 * This file is part of rasdaman community.
 *
 * Rasdaman community is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Rasdaman community is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with rasdaman community.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014 Peter Baumann / rasdaman GmbH.
 *
 * For more information please see <http://www.rasdaman.org>
 * or contact Peter Baumann via <baumann@rasdaman.com>.
 */
#include "../../../common/src/logging/easylogging++.hh"

#include "../exception/unsupportedmessageexception.hh"
#include "../common/zmqutil.hh"

#include "serverpinghandler.hh"

namespace rasnet
{

ServerPingHandler::ServerPingHandler(boost::shared_ptr<ClientPool> clientPool, zmq::socket_t &socket):
    clientPool(clientPool),
    socket(socket)
{}

ServerPingHandler::~ServerPingHandler()
{}

bool ServerPingHandler::canHandle(const std::vector<boost::shared_ptr<zmq::message_t> > &message)
{
    MessageType messageType;

    if(message.size() == 1
            && messageType.ParseFromArray(message[0]->data(), message[0]->size())
            && messageType.type() == MessageType::ALIVE_PING)
    {
        return true;
    }
    else
    {
        return false;
    }
}

void ServerPingHandler::handle(const std::vector<boost::shared_ptr<zmq::message_t> > &message, const std::string &peerId)
{
    //If the message type is invalid, throw an exception
    //this should only happen if the programmer does something stupid
    if (!this->canHandle(message))
    {
        throw UnsupportedMessageException();
    }
    else if(!clientPool->isClientAlive(peerId))
    {
        //if the client is not alive(or registered), ignore the message, but log it
        LDEBUG<<"Client with ID:"<<peerId<<" sent PING, but the client is not part of the pool of active clients.";
    }
    //Send the PONG and log the error
    else if(!ZmqUtil::sendCompositeMessageToPeer(socket, peerId, MessageType::ALIVE_PONG))
    {
        LERROR<<"Failed to send pong message to client.";
    }
}

}