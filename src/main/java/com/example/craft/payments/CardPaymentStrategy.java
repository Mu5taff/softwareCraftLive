package com.example.craft.payments;

import com.example.craft.domain.Order;

public class CardPaymentStrategy implements PaymentStrategy {

    private final int LARGE_PAYMENT_THRESHOLD = 100000;

    @Override
    public void processPayment(Order order, int total) {
        System.out.println("Taking card payment for £" + Helper.formatPounds(total));

        if (total > LARGE_PAYMENT_THRESHOLD) {
            System.out.println("Large card payment requires manual review");
        }
    }

    
}