package com.consumers.cosumers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeliveryDetailsDto {
    private String DeliveryAdd;
    private Boolean isDeliveried;

}
