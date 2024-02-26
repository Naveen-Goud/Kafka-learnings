package com.producers.producers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Getter
public class ItemDto {
    private String ItemName;
    private Number ItemCost;
    private Number ItemQuantity;
}
