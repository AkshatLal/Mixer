package com.example.parket.music.Mixer.services;

import com.example.parket.music.Mixer.model.TimeRecord;
import com.example.parket.music.Mixer.repositories.TimeRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

@Service
public class TimeService {

    @Autowired
    private TimeRecordRepository timeRecordRepository;

    public String getParisTime() {
        ZonedDateTime parisTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        String formattedTime = parisTime.format(formatter);

        TimeRecord timeRecord = new TimeRecord("1", formattedTime);
        timeRecordRepository.save(timeRecord);

        return formattedTime;
    }

    public TimeRecord getTimeRecord(String id) {
        return timeRecordRepository.findById(id).orElse(null);
    }
}