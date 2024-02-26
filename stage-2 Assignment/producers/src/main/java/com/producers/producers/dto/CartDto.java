package com.producers.producers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class CartDto {
    private String Item;
    private Number Count;
}
