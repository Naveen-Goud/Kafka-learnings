package com.assignment.finalassignment.controller;

import com.assignment.finalassignment.dto.SongRequestDto;
import com.assignment.finalassignment.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/songs")
public class SongController {
    @Autowired
    private SongService songService;
    @PostMapping
    public ResponseEntity<SongRequestDto> addsongs(@RequestBody SongRequestDto song)  {
      return  ResponseEntity.ok(songService.updateSong(song));
    }

    @GetMapping("/{id}")
    public  ResponseEntity<SongRequestDto> getSong(@RequestParam String id)  {
        return  ResponseEntity.ok(songService.getSongbyId(id));
    }
}
