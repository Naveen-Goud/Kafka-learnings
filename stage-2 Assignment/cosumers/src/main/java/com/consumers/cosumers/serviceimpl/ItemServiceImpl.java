package com.consumers.cosumers.serviceimpl;

import com.consumers.cosumers.constant.AppConstant;
import com.consumers.cosumers.dto.CartDto;
import com.consumers.cosumers.dto.DeliveryDetailsDto;
import com.consumers.cosumers.dto.ItemDto;
import com.consumers.cosumers.dto.OrderDetailsDto;
import com.consumers.cosumers.service.ItemOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemOrderService {

    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;

    private Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
    @Override
    public ItemDto addItem(ItemDto itemDto) {
        kafkaTemplate.send(AppConstant.Topic[0], itemDto);
        logger.info("item saved");
        return itemDto;
    }

    @Override
    public OrderDetailsDto orderDetails(OrderDetailsDto orderDto) {
        kafkaTemplate.send(AppConstant.Topic[3], orderDto);
        logger.info("order saved");
        return orderDto;
    }

    @Override
    public CartDto addToCart(CartDto cartDto) {
        kafkaTemplate.send("cart-details", cartDto);
        logger.info("item saved in cart");
        return cartDto;
    }

    @Override
    public DeliveryDetailsDto deliveryDetails(DeliveryDetailsDto deliveryDetailsDto) {
        kafkaTemplate.send(AppConstant.Topic[4], deliveryDetailsDto);
        logger.info("delivery details saved");
        return deliveryDetailsDto;
    }
}
