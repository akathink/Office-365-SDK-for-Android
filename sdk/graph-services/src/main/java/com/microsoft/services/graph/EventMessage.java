/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;





/**
 * The type Event Message.
*/
public class EventMessage extends Message {

    public EventMessage(){
        setODataType("#microsoft.graph.eventMessage");
    }
            
    private MeetingMessageType MeetingMessageType;
     
    /**
    * Gets the Meeting Message Type.
    *
    * @return the MeetingMessageType
    */
    public MeetingMessageType getMeetingMessageType() {
        return this.MeetingMessageType; 
    }

    /**
    * Sets the Meeting Message Type.
    *
    * @param value the MeetingMessageType
    */
    public void setMeetingMessageType(MeetingMessageType value) { 
        this.MeetingMessageType = value; 
        valueChanged("MeetingMessageType", value);

    }
            
    private Event Event;
     
    /**
    * Gets the Event.
    *
    * @return the Event
    */
    public Event getEvent() {
        return this.Event; 
    }

    /**
    * Sets the Event.
    *
    * @param value the Event
    */
    public void setEvent(Event value) { 
        this.Event = value; 
        valueChanged("Event", value);

    }
}

