package com.assignment.finalassignment.service;

import com.assignment.finalassignment.constant.AppConstant;
import com.assignment.finalassignment.dto.SongRequestDto;
import com.assignment.finalassignment.entity.Song;
import com.assignment.finalassignment.exceptions.ExceptionHandler;
import com.assignment.finalassignment.exceptions.NotFoundException;
import com.assignment.finalassignment.repository.SongRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SongService {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    @Autowired
    private SongRepository songRepository;

    @Autowired
    private ModelMapper modelMapper;

    public SongRequestDto updateSong(SongRequestDto song) {
        try{
            Song newsong=modelMapper.map(song,Song.class);
            songRepository.save(newsong);
            kafkaTemplate.send(AppConstant.SONGS, newsong);
            return song;
        }catch (Exception e){
                throw new RuntimeException(e);
        }

    }

    public SongRequestDto getSongbyId(String id)  {
        try{
            Song song=songRepository.getSongById(id);
            SongRequestDto newsong=modelMapper.map(song,SongRequestDto.class);
            return  newsong;
        }catch (Exception e){
            throw new NotFoundException(e.getMessage());
        }

    }
}
