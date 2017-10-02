package com.onetimes.xoomdatevent.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by onetimes on 02/10/17.
 */

public class Events {

    @SerializedName("_source")
    private Event event;

    public Events() {
    }

    public Events(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
