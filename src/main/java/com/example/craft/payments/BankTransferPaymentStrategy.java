package com.example.craft.payments;

import com.example.craft.Utils.Helper;
import com.example.craft.domain.Order;

public class BankTransferPaymentStrategy implements PaymentStrategy {

    private final int BANK_TRANSFER_LOW_VALUE = 1000;

    @Override
    public void processPayment(Order order, int total) {
        System.out.println("Creating bank transfer request for £" + Helper.formatPounds(total));

        if (total < BANK_TRANSFER_LOW_VALUE) {
            System.out.println("Bank transfer for low value order may not be worth processing");
        }
    }

}