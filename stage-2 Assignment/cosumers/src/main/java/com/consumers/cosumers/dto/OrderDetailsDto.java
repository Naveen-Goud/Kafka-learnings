package com.consumers.cosumers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class OrderDetailsDto {
    private Integer OrderNumber;
    private  String Name;
    private Integer Cost;
}
