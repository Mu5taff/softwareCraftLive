package com.example.craft.payments;

public class Helper {
    public static String formatPounds(int pennies) {
        return String.format("%.2f", pennies / 100.0);
    }
}
