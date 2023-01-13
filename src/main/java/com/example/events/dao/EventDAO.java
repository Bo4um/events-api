package com.example.events.dao;

import com.example.events.model.Event;

import java.util.List;

public interface EventDAO {
    Event read(Long id);
    List<Event> readAll();
    void update();
    void create();
    void delete();
}
