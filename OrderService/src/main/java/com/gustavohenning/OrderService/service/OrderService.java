package com.gustavohenning.OrderService.service;

import com.gustavohenning.OrderService.model.OrderRequest;
import com.gustavohenning.OrderService.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
