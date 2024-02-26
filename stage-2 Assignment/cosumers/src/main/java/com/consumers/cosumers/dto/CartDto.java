package com.consumers.cosumers.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Setter
@AllArgsConstructor
@Getter
public class CartDto {
    private String Item;
    private Number Count;
}
