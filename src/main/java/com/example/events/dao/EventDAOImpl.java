package com.example.events.dao;

import com.example.events.model.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EventDAOImpl implements EventDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Event read(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Event.class, id);
    }

    @Override
    public List<Event> readAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Event", Event.class).list();
    }

    @Override
    public void update() {

    }

    @Override
    public void create() {

    }

    @Override
    public void delete() {

    }
}
