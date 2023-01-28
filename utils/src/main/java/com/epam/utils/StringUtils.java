package com.epam.utils;

import java.math.BigDecimal;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            if (Double.parseDouble(str) <= 0) {
                return false;
            }
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
}
