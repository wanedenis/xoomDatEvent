package com.onetimes.xoomdatevent.rest;

import com.onetimes.xoomdatevent.model.EventResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Apps Onetimes on 02/10/2017.
 */

public interface ApiInterface {

        @GET("?q=all%20events&search_term_rank_value=5&city=Long%20Beach&city_rank_value=1&start_date=2015-09-26&end_date=2017-10-16")
        Call<EventResponse> getAllEvents();

    /*
        @GET("Event/{event_id}")
        Call<EventResponse> getEventDetails(@Path("event_id") long id, @Query("api_key") String apiKey);
*/
}
