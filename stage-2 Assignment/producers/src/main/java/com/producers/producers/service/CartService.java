package com.producers.producers.service;

import com.producers.producers.dto.CartDto;
import com.producers.producers.dto.DeliveryDetailsDto;
import com.producers.producers.dto.ItemDto;
import com.producers.producers.dto.OrderDetailsDto;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @KafkaListener(topics = "item-details", groupId = "my-group1")
    public void itemDetails(ConsumerRecord<String, ItemDto> itemDtoConsumerRecord) {
        System.out.println(itemDtoConsumerRecord.value());
    }

    @KafkaListener(topics = "item-summary", groupId = "user-group2")
    public void itemSummary(ConsumerRecord<String, ItemDto> record) {
        System.out.println(record);
    }
    @KafkaListener(topics = "cart-details", groupId = "user-group3")
    public void cartDetails(ConsumerRecord<String, CartDto> cartDtoConsumerRecordrecord) {
        System.out.println(cartDtoConsumerRecordrecord.value());
    }
    @KafkaListener(topics = "order-details", groupId = "user-group4")
    public void orderDetails(ConsumerRecord<String, OrderDetailsDto> orderDetailsDtoConsumerRecord) {
        System.out.println(orderDetailsDtoConsumerRecord.value());
    }
    @KafkaListener(topics = "delivery-details", groupId = "user-group5")
    public void deliveryDetails(ConsumerRecord<String, DeliveryDetailsDto> deliveryDetailsDtoConsumerRecord) {
        System.out.println(deliveryDetailsDtoConsumerRecord);
    }
}
