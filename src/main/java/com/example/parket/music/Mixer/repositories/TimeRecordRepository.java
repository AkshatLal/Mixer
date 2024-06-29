package com.example.parket.music.Mixer.repositories;

import com.example.parket.music.Mixer.model.TimeRecord;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface TimeRecordRepository extends AerospikeRepository<TimeRecord, String> {
}