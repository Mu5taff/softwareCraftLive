package com.example.craft.utils;

public class Helper {
    private Helper() {}
    public static String formatPounds(int pennies) {
        return String.format("%.2f", pennies / 100.0);
    }
}
