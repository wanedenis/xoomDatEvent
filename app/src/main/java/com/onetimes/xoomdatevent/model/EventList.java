package com.onetimes.xoomdatevent.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by onetimes on 02/10/17.
 */

public class EventList {

    @SerializedName("total")
    private long total;
    @SerializedName("matching_events")
    private List<Events> events;

    public EventList() {
    }

    public EventList(long total, List<Events> events) {
        this.total = total;
        this.events = events;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<Events> getEvents() {
        return events;
    }

    public void setEvents(List<Events> events) {
        this.events = events;
    }
}
