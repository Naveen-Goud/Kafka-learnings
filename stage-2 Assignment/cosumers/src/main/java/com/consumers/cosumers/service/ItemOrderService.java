package com.consumers.cosumers.service;

import com.consumers.cosumers.dto.CartDto;
import com.consumers.cosumers.dto.DeliveryDetailsDto;
import com.consumers.cosumers.dto.ItemDto;
import com.consumers.cosumers.dto.OrderDetailsDto;

public interface ItemOrderService {
    ItemDto addItem(ItemDto itemDto);

    OrderDetailsDto orderDetails(OrderDetailsDto orderDto);

    CartDto addToCart(CartDto cartDto);

    DeliveryDetailsDto deliveryDetails(DeliveryDetailsDto deliveryDetailsDto);
}
