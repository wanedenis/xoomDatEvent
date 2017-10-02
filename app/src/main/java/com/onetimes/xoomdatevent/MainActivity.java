package com.onetimes.xoomdatevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.onetimes.xoomdatevent.adapter.RecyclerEventAdapter;
import com.onetimes.xoomdatevent.model.Event;
import com.onetimes.xoomdatevent.model.EventResponse;
import com.onetimes.xoomdatevent.model.Events;
import com.onetimes.xoomdatevent.rest.ApiClient;
import com.onetimes.xoomdatevent.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private final static String API_KEY = "";

    List<Event> liste_event = new ArrayList<Event>();

    RecyclerView recyclerView;
    ProgressBar progressBar;
    TextView empty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        empty = (TextView) findViewById(R.id.empty);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);

        //recyclerView


        progressBar.setVisibility(View.VISIBLE);
        empty.setVisibility(View.GONE);
        recyclerView.setVisibility(View.GONE);

        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

        Call<EventResponse> call = apiService.getAllEvents();

        call.enqueue(new Callback<EventResponse>() {
            @Override
            public void onResponse(Call<EventResponse>call, Response<EventResponse> response) {

                if (response != null) {

                    Log.e(TAG, "code = " + response.message());

                    Log.e(TAG, "total = " + response.body().getSearch_results().getTotal());

                    List<Events> events = response.body().getSearch_results().getEvents();


                    for (int i = 0; i < events.size(); i++) {

                        liste_event.add(events.get(i).getEvent());
                    }

                    Log.e(TAG, "Number of Event received: " + liste_event.size());

                }else {

                    Log.e(TAG, "Response NULL");

                }

                progressBar.setVisibility(View.GONE);
                empty.setVisibility(View.GONE);
                recyclerView.setVisibility(View.VISIBLE);

                //List<Event> events = response.body().getResults();
                recyclerView.setAdapter(new RecyclerEventAdapter(liste_event, MainActivity.this));

            }

            @Override
            public void onFailure(Call<EventResponse>call, Throwable t) {
                // Log error here since request failed
                Log.e(TAG, t.toString());
                progressBar.setVisibility(View.GONE);
                empty.setVisibility(View.VISIBLE);
                recyclerView.setVisibility(View.GONE);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_refresh) {

            progressBar.setVisibility(View.VISIBLE);
            empty.setVisibility(View.GONE);
            recyclerView.setVisibility(View.GONE);

            ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

            Call<EventResponse> call = apiService.getAllEvents();

            call.enqueue(new Callback<EventResponse>() {
                @Override
                public void onResponse(Call<EventResponse>call, Response<EventResponse> response) {

                    if (response != null) {

                        Log.e(TAG, "code = " + response.message());

                        Log.e(TAG, "total = " + response.body().getSearch_results().getTotal());

                        List<Events> events = response.body().getSearch_results().getEvents();


                        for (int i = 0; i < events.size(); i++) {

                            liste_event.add(events.get(i).getEvent());
                        }

                        Log.e(TAG, "Number of Event received: " + liste_event.size());

                    }else {

                        Log.e(TAG, "Response NULL");

                    }

                    progressBar.setVisibility(View.GONE);
                    empty.setVisibility(View.GONE);
                    recyclerView.setVisibility(View.VISIBLE);

                    //List<Event> events = response.body().getResults();
                    recyclerView.setAdapter(new RecyclerEventAdapter(liste_event, MainActivity.this));

                }

                @Override
                public void onFailure(Call<EventResponse>call, Throwable t) {
                    // Log error here since request failed

                    progressBar.setVisibility(View.GONE);
                    empty.setVisibility(View.VISIBLE);
                    recyclerView.setVisibility(View.GONE);

                    Log.e(TAG, t.toString());
                }
            });


            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
