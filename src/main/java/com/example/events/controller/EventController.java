package com.example.events.controller;

import com.example.events.model.Event;
import com.example.events.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private EventService eventService;

    @Autowired
    public void setEventService(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/")
    public List<Event> readAll() {
        return eventService.getAll();
    }

    @GetMapping("/{id}")
    public Event read(@PathVariable Long id) {
        return eventService.get(id);
    }

    @PostMapping("/")
    public void create(@RequestBody Event event) {
        eventService.create(event);
    }

    @PutMapping("/")
    public void update(@RequestBody Event event) {
        eventService.update(event);
    }

    @DeleteMapping("/")
    public void delete(@RequestBody Event event) {
        eventService.delete(event);
    }

}
