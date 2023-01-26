package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args) {
            try {
                if (Double.parseDouble(arg) <= 0) {
                    return false;
                }
            } catch (NumberFormatException | NullPointerException e) {
                return false;
            }
        }
        return true;
    }
}