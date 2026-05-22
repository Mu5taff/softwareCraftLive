package com.example.craft.delivery;

import com.example.craft.domain.Order;

public class StandardDeliveryStrategy implements DeliveryStrategy {

    private static final int STANDARD_DELIVERY_RATE = 399; 
    private static final int STANDARD_FREE_DELIVERY_THRESHOLD = 5000;

    @Override
    public int calculateDelivery(Order order, int subtotal) {
        System.out.println("Standard delivery selected");
        return subtotal > STANDARD_FREE_DELIVERY_THRESHOLD ? 0 : STANDARD_DELIVERY_RATE;
    }
}
