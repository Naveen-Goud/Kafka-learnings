package com.assignment.finalassignment.repository;

import com.assignment.finalassignment.entity.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends MongoRepository<Song,Integer> {
    Song getSongById(String id);
}
