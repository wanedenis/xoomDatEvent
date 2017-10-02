package com.onetimes.xoomdatevent.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Apps Onetimes on 01/10/2017.
 */

public class Event {

    @SerializedName("id")
    private String id;
    @SerializedName("event_id")
    private long event_id;
    @SerializedName("cover")
    private String cover;
    @SerializedName("description")
    private String description;
    @SerializedName("end_time")
    private String end_time;
    @SerializedName("end_time_human_readable")
    private String end_time_human;
    @SerializedName("latitude")
    private long latitude;
    @SerializedName("longitude")
    private long longitude;
    @SerializedName("location_name")
    private String location_name;
    @SerializedName("name")
    private String name;
    @SerializedName("owner_name")
    private String owner_name;
    @SerializedName("privacy")
    private String privacy;
    @SerializedName("search_terms")
    private String search_terms;
    @SerializedName("sort_name")
    private String sort_name;
    @SerializedName("spell_check")
    private String spell_check;
    @SerializedName("start_time")
    private String start_time;
    @SerializedName("start_time_human_readable")
    private String start_time_human;
    @SerializedName("text")
    private String text;

    public Event() {
    }

    public Event(String id, long event_id, String cover, String description, String end_time, String end_time_human, long latitude, long longitude, String location_name, String name, String owner_name,
                 String privacy, String search_terms, String sort_name, String spell_check, String start_time, String start_time_human, String text) {
        this.id = id;
        this.event_id = event_id;
        this.cover = cover;
        this.description = description;
        this.end_time = end_time;
        this.end_time_human = end_time_human;
        this.latitude = latitude;
        this.longitude = longitude;
        this.location_name = location_name;
        this.name = name;
        this.owner_name = owner_name;
        this.privacy = privacy;
        this.search_terms = search_terms;
        this.sort_name = sort_name;
        this.spell_check = spell_check;
        this.start_time = start_time;
        this.start_time_human = start_time_human;
        this.text = text;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(long event_id) {
        this.event_id = event_id;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getEnd_time_human() {
        return end_time_human;
    }

    public void setEnd_time_human(String end_time_human) {
        this.end_time_human = end_time_human;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public String getLocation_name() {
        return location_name;
    }

    public void setLocation_name(String location_name) {
        this.location_name = location_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getSearch_terms() {
        return search_terms;
    }

    public void setSearch_terms(String search_terms) {
        this.search_terms = search_terms;
    }

    public String getSort_name() {
        return sort_name;
    }

    public void setSort_name(String sort_name) {
        this.sort_name = sort_name;
    }

    public String getSpell_check() {
        return spell_check;
    }

    public void setSpell_check(String spell_check) {
        this.spell_check = spell_check;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getStart_time_human() {
        return start_time_human;
    }

    public void setStart_time_human(String start_time_human) {
        this.start_time_human = start_time_human;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
