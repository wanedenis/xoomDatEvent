package com.onetimes.xoomdatevent.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Apps Onetimes on 02/10/2017.
 */

public class EventResponse {

    @SerializedName("search_results")
    private EventList search_results;

    public EventResponse() {
    }

    public EventResponse(EventList search_results) {
        this.search_results = search_results;
    }

    public EventList getSearch_results() {
        return search_results;
    }

    public void setSearch_results(EventList search_results) {
        this.search_results = search_results;
    }
}
