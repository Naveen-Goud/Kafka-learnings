package com.assignment.finalassignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class SongRequestDto {
    private String songName;
    private String author;
}
