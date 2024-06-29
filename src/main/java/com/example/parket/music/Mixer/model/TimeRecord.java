package com.example.parket.music.Mixer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.aerospike.mapping.Document;

@Document
public class TimeRecord {

    @Id
    private String id;
    private String time;

    public TimeRecord() {}

    public TimeRecord(String id, String time) {
        this.id = id;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}