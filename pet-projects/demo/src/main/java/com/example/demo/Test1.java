package com.example.demo;

import com.example.demo.util.DateParserUtil;

import java.time.LocalDateTime;

public class Test1 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(DateParserUtil.parseDateToTime(dateTime));
    }
}
