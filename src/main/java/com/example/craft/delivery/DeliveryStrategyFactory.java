package com.example.craft.delivery;

import com.example.craft.domain.DeliveryType;

public class DeliveryStrategyFactory {

    public DeliveryStrategy getStrategy(DeliveryType deliveryType) {

     if (deliveryType == null) {
        throw new IllegalArgumentException("Unknown delivery type: null");
    }
        
        switch (deliveryType) {

            case COLLECTION:
                return new CollectionDeliveryStrategy();

            case NEXT_DAY:
                return new NextDayDeliveryStrategy();

            case STANDARD:
                return new StandardDeliveryStrategy();

            default:
                throw new IllegalArgumentException(
                        "Unknown delivery type: " + deliveryType
                );
        }
    }
}