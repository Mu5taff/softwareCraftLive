package com.example.craft.delivery;

import com.example.craft.domain.Order;
import com.example.craft.domain.Customer;

public class CollectionDeliveryStrategy implements DeliveryStrategy {

    @Override
    public int calculateDelivery(Order order, int subtotal) {
        System.out.println("Collection selected");

        Customer customer = order.getCustomer();

        if (customer.getPhoneNumber() == null) {
            System.out.println("Collection selected but no phone number was provided");
        }

        return 0;
    }
}