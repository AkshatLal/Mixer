package com.example.parket.music.Mixer.controllers;

import com.example.parket.music.Mixer.model.TimeRecord;
import com.example.parket.music.Mixer.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping("/api/time/paris")
    public String getParisTime() {
        return timeService.getParisTime();
    }

    @GetMapping("/api/time/{id}")
    public TimeRecord getTimeRecord(@PathVariable String id) {
        return timeService.getTimeRecord(id);
    }
}