package com.example.Electronic_questionnaires.utils;

import com.example.Electronic_questionnaires.dao.impl.EventDAOImpl;
import com.example.Electronic_questionnaires.entity.Event;

public class Main3 {
    public static void main(String[] args) {
        EventDAOImpl eventDAO = new EventDAOImpl();
        Event event = new Event("xx`12xxx","x`1xxxx");
        eventDAO.save(event);
    }
}
