package com.example.craft.payments;

import com.example.craft.domain.PaymentType;

public class PaymentStrategyFactory {

    public PaymentStrategy getStrategy(PaymentType paymentType) {

        switch (paymentType) {

            case CARD:
                return new CardPaymentStrategy();

            case PAYPAL:
                return new PaypalPaymentStrategy();

            case BANK_TRANSFER:
                return new BankTransferPaymentStrategy();

            default:
                throw new IllegalArgumentException(
                        "Unknown payment type: " + paymentType
                );
        }
    }
}