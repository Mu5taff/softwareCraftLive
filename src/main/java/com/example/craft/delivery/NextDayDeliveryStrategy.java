package com.example.craft.delivery;

import com.example.craft.domain.Order;

public class NextDayDeliveryStrategy implements DeliveryStrategy {

    private static final int NEXTDAY_DELIVERY_RATE = 799; 
    private static final int NEXTDAY_DELIVERY_RATE_DISCOUNTED = 499; 
    private static final int NEXTDAY_DISCOUNTED_DELIVERY_THRESHOLD = 5000;

    @Override
    public int calculateDelivery(Order order, int subtotal) {
        System.out.println("Next day delivery selected");
        return subtotal > NEXTDAY_DISCOUNTED_DELIVERY_THRESHOLD ? NEXTDAY_DELIVERY_RATE_DISCOUNTED: NEXTDAY_DELIVERY_RATE;
    }
}