package com.example.tms;

public class EventModel {
    String eventName;
    String eventLocation;
    String EventType;
    int image;

    public EventModel(String eventName, String eventLocation, String eventType, int image) {
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        EventType = eventType;
        this.image = image;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public int getImage() {
        return image;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventType() {
        return EventType;
    }
}
