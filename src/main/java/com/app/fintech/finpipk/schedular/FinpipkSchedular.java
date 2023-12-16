package com.app.fintech.finpipk.schedular;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class FinpipkSchedular {
    @Scheduled(cron = "0/20 * * * * ?")
    public void runEvey1Seconds() {
        System.out.println("Current time is :: " + LocalDate.now());
    }
}
