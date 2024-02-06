package org.example.demoscheduler.config;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@EnableScheduling
public class SchedulerConfiguration {
    @Scheduled(cron = "*/3 * * * * *")
    public void checkScheduling(){
        System.out.println(LocalDateTime.now());
    }
}
