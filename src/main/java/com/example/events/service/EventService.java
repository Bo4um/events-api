package com.example.events.service;

import com.example.events.model.Event;

import java.util.List;

public interface EventService {
    List<Event> getAll();
    Event get(Long id);
    void delete(Event event);
    void update(Event event);
    void create(Event event);

}
