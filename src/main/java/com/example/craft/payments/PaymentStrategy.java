package com.example.craft.payments;

import com.example.craft.domain.Order;

public interface PaymentStrategy {
    void processPayment(Order order, int total);
}