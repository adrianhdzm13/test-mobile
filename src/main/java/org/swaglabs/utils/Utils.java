package org.swaglabs.utils;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * </p>Class containing utility functions.</p>
 * */

public class Utils {
    /**
     * </p>Method to convert a text string
     * to text with UTF-8 format.</p>
     * */
    public static String convertUtf8(String text) {
        byte[] ptext = text.getBytes(ISO_8859_1);
        String result = new String(ptext, UTF_8);
        return result;
    }
}
