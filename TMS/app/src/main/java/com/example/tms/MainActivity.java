package com.example.tms;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    ArrayList<EventModel> eventModels= new ArrayList<>();
    int[] eventImages = {R.drawable.untold, R.drawable.tiff, R.drawable.electric_castle, R.drawable.tenis, R.drawable.saga, R.drawable.wine_festival};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);
        setUpEventModels();
        EventAdapter adapter = new EventAdapter(this, eventModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void setUpEventModels(){
        String[] eventNameModels = getResources().getStringArray(R.array.event_model_full_txt);
        String[] eventVenueModels = getResources().getStringArray(R.array.event_model_venue_txt);
        String[] eventTypeModels = getResources().getStringArray(R.array.event_model_eventType_txt);
        for(int i=0; i < eventNameModels.length;i++)
        {
            eventModels.add(new EventModel(eventNameModels[i], eventVenueModels[i], eventTypeModels[i], eventImages[i]));
        }
    }
}
