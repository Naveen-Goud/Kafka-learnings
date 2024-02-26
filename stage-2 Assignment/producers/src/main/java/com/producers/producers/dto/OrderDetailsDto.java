package com.producers.producers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class OrderDetailsDto {
    private Integer OrderNumber;
    private  String Name;
    private Integer Cost;
}
