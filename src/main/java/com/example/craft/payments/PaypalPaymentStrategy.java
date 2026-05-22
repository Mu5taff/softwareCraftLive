package com.example.craft.payments;

import com.example.craft.Utils.Helper;
import com.example.craft.domain.Customer;
import com.example.craft.domain.Order;

public class PaypalPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(Order order, int total) {
        Customer customer = order.getCustomer();

        System.out.println("Taking PayPal payment for £" + Helper.formatPounds(total));

        if (customer.getEmail().endsWith("@example.com")) {
            System.out.println("PayPal payment using test-like email address");
        }
    }
}