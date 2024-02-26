package com.consumers.cosumers.controller;

import com.consumers.cosumers.dto.CartDto;
import com.consumers.cosumers.dto.DeliveryDetailsDto;
import com.consumers.cosumers.dto.ItemDto;
import com.consumers.cosumers.dto.OrderDetailsDto;
import com.consumers.cosumers.service.ItemOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ItemOrderController {

    @Autowired
    private ItemOrderService itemOrderService;

    @PostMapping("/item")
    public ResponseEntity<ItemDto> addItem(@RequestBody ItemDto itemDto){
        return ResponseEntity.ok( itemOrderService.addItem(itemDto));
    }
    @PostMapping("/order")
    public ResponseEntity<OrderDetailsDto> orderSummary(@RequestBody OrderDetailsDto orderDto){
        return ResponseEntity.ok( itemOrderService.orderDetails(orderDto));
    }
    @PostMapping("/cart")
    public ResponseEntity<CartDto> cartItems(@RequestBody CartDto cartDto){
        return ResponseEntity.ok( itemOrderService.addToCart(cartDto));
    }
    @PostMapping("/delivery")
    public ResponseEntity<DeliveryDetailsDto> deliveryDetails(@RequestBody DeliveryDetailsDto deliveryDetailsDto){
        return ResponseEntity.ok( itemOrderService.deliveryDetails(deliveryDetailsDto));
    }

}
