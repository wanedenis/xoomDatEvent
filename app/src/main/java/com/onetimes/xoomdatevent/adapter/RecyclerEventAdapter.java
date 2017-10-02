package com.onetimes.xoomdatevent.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.onetimes.xoomdatevent.MainActivity;
import com.onetimes.xoomdatevent.R;
import com.onetimes.xoomdatevent.model.Event;

import java.util.List;

/**
 * Created by Apps Onetimes on 02/10/2017.
 */

public class RecyclerEventAdapter extends RecyclerView.Adapter<RecyclerEventAdapter.EventViewHolder>{

    private static final String TAG = MainActivity.class.getSimpleName();

    private List<Event> events;
    private Context context;


    public RecyclerEventAdapter(List<Event> events, Context context) {
        this.events = events;
        this.context = context;

        Log.e(TAG, "Number of Event received: " + events.size());
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_list_event, parent, false);
        return new EventViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {


        Glide.with(context).load(events.get(position).getCover())
                .thumbnail(0.5f)
                .crossFade()
                .placeholder(R.drawable.xoomdat)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.cover);

        holder.title.setText(events.get(position).getName());
        holder.location.setText(events.get(position).getLocation_name());
        String str = "Organized by: " + events.get(position).getOwner_name();
        holder.by.setText(str);
        holder.from.setText(events.get(position).getStart_time_human());
        holder.to.setText(events.get(position).getEnd_time_human());

    }

    @Override
    public int getItemCount() {
        return events.size();
    }


    public class EventViewHolder extends RecyclerView.ViewHolder {

        CardView card;
        ImageView cover;
        TextView title;
        TextView location;
        TextView by;
        TextView from;
        TextView to;


        public EventViewHolder(View v) {
            super(v);

            card = (CardView) v.findViewById(R.id.card);
            cover = (ImageView) v.findViewById(R.id.cover);
            title = (TextView) v.findViewById(R.id.title);
            location = (TextView) v.findViewById(R.id.location);
            by = (TextView) v.findViewById(R.id.by);
            from = (TextView) v.findViewById(R.id.from);
            to = (TextView) v.findViewById(R.id.to);

        }
    }
}
