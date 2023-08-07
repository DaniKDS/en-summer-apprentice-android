package com.example.tms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {
    Context context;
    ArrayList<EventModel> eventModels;

    public EventAdapter(Context context, ArrayList<EventModel> eventModels) {
        this.context = context;
        this.eventModels = eventModels;
    }

    @NonNull
    @Override
    public EventAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycle_view_row, parent, false);
        return new EventAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdapter.MyViewHolder holder, int position) {
        holder.name.setText(eventModels.get(position).getEventName());
        holder.eventType.setText(eventModels.get(position).getEventType());
        holder.venue.setText(eventModels.get(position).getEventLocation());
        holder.imageView.setImageResource(eventModels.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return eventModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView name, venue, eventType;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView3);
            venue = itemView.findViewById(R.id.textView5);
            eventType = itemView.findViewById(R.id.textView4);
        }
    }
}