package com.example.events.service;

import com.example.events.dao.EventDAO;
import com.example.events.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private EventDAO eventDAO;

    @Autowired
    public void setEventDAO(EventDAO eventDAO) {
        this.eventDAO = eventDAO;
    }

    @Override
    public List<Event> getAll() {
        return eventDAO.readAll();
    }

    @Override
    public Event get(Long id) {
        return eventDAO.read(id);
    }

    @Override
    public void delete(Event event) {
        eventDAO.delete(event);
    }

    @Override
    public void update(Event event) {
        eventDAO.update(event);
    }

    @Override
    public void create(Event event) {
        eventDAO.create(event);
    }
}
