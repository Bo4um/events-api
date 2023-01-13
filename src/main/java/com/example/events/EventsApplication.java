package com.example.events;

import com.example.events.config.HibernateConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventsApplication.class, args);
    }

    protected Class<?> getRootConfigClasses() {
        return HibernateConfig.class;
    }

}
