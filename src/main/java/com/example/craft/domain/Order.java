package com.example.craft.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Order {
    private final String orderId;
    private final Customer customer;
    private final List<OrderItem> items = new ArrayList<>();
    private final DeliveryType deliveryType;
    private final PaymentType paymentType;

    public Order(String orderId, Customer customer, DeliveryType deliveryType, PaymentType paymentType) {
        this.orderId = orderId;
        this.customer = customer;
        this.deliveryType = deliveryType;
        this.paymentType = paymentType;
    }

    public String getOrderId() { return orderId; }
    public Customer getCustomer() { return customer; }
    public List<OrderItem> getItems() { return Collections.unmodifiableList(items); }
    public DeliveryType getDeliveryType() { return deliveryType; }
    public PaymentType getPaymentType() { return paymentType; }

    public void addItem(OrderItem item) {
        items.add(item);
    }
}
