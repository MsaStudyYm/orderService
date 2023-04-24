package com.orderService.orderService.service;

import com.orderService.orderService.dto.OrderDto;
import com.orderService.orderService.jpa.OrderEntity;

public interface OrderService {
    OrderDto createOrder(OrderDto orderDetails);
    OrderDto getOrderByOrderId(String orderId);
    Iterable<OrderEntity> getOrdersByUserId(String userId);
}
