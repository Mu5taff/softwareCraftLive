package com.example.craft.Utils;

public class Helper {
    public static String formatPounds(int pennies) {
        return String.format("%.2f", pennies / 100.0);
    }
}
