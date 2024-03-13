package com.assignment.consumeruser.service;

import com.assignment.consumeruser.dto.SongRequestDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @KafkaListener(topics = "song", groupId = "user-group")
    public void songLocation(ConsumerRecord<String, SongRequestDto> newSong) {
        System.out.println(newSong.value());
    }
}
