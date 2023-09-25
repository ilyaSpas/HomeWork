package com.example.web_app1.repo;

import com.example.web_app1.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EventRepository extends JpaRepository<Event, Long> {
}
