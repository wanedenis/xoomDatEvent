package com.onetimes.xoomdatevent.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Apps Onetimes on 02/10/2017.
 */

public class ApiClient {

    public static final String URL = "https://www.xoomdatevent.com/xoomdat-api-search-events/?q=all%20events&search_term_rank_value=5&city=Long%20Beach&city_rank_value=1&start_date=2015-09-26&end_date=2017-10-16";
    public static final String Base_URL = "https://www.xoomdatevent.com/xoomdat-api-search-events/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient() {

        if (retrofit==null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
