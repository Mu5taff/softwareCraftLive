package com.example.craft.discount;

import com.example.craft.domain.Order;
import com.example.craft.domain.OrderItem;

public class LoyaltyDiscountStrategy  implements DiscountStrategy {
    
    private static final double LOYALTY_DISCOUNT_RATE = 0.12; 
    private static final int LOYALTY_PAYMENT_THRESHOLD = 7500;
    private static final int LOYALTY_ITEM_THRESHOLD = 3;
    private static final int LOYALTY_PAYMENT_DISCOUNT = 200;
    private static final int LOYALTY_ITEMS_DISCOUNT = 150;
    private static final double LOYALTY_DISCOUNT_MAX_RATE = 0.25;

    
    @Override
    public int calculateDiscount(Order order, int subtotal) {
        
        int discount = (int) (subtotal * LOYALTY_DISCOUNT_RATE);
        
        if (countItems(order) > LOYALTY_ITEM_THRESHOLD) {
            discount += LOYALTY_ITEMS_DISCOUNT;
        }

        if (subtotal > LOYALTY_PAYMENT_THRESHOLD) {
            discount += LOYALTY_PAYMENT_DISCOUNT;
        }

        int maxDiscount = (int) (LOYALTY_DISCOUNT_MAX_RATE*subtotal);
        return Math.min(discount, maxDiscount);
    }

    int countItems(Order order) {
        int itemCount = 0;

        for (OrderItem item : order.getItems()) {
            itemCount += item.getQuantity();
        }
        return itemCount;
    }
}
