/*
 *
 *
 * Copyright 2016 The Symphony Software Foundation
 *
 * Licensed to The Symphony Software Foundation (SSF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.symphonyoss.client.services;


import org.symphonyoss.client.model.Room;
import org.symphonyoss.symphony.agent.model.*;
import org.symphonyoss.symphony.clients.model.SymMessage;

/**
 * @author Frank Tarsillo
 */
public interface RoomServiceListener {

    void onNewRoom(Room room);

    void onRoomDeactivatedMessage(RoomDeactivatedMessage roomDeactivatedMessage);

    void onRoomMemberDemotedFromOwnerMessage(RoomMemberDemotedFromOwnerMessage roomMemberDemotedFromOwnerMessage);

    void onRoomMemberPromotedToOwnerMessage(RoomMemberPromotedToOwnerMessage roomMemberPromotedToOwnerMessage);

    @SuppressWarnings("unused")
    void onRoomReactivatedMessage(RoomReactivatedMessage roomReactivatedMessage);

    void onRoomUpdatedMessage(RoomUpdatedMessage roomUpdatedMessage);

    void onUserJoinedRoomMessage(UserJoinedRoomMessage userJoinedRoomMessage);

    void onUserLeftRoomMessage(UserLeftRoomMessage userLeftRoomMessage);

    void onRoomCreatedMessage(RoomCreatedMessage roomCreatedMessage);

    void onMessage(SymMessage symMessage);

}
