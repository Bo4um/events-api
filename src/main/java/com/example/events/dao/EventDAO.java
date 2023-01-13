package com.example.events.dao;

import com.example.events.model.Event;

import java.util.List;

public interface EventDAO {
    Event read(Long id);
    List<Event> readAll();
    void update(Event event);
    void create(Event event);
    void delete(Event Event);
}
