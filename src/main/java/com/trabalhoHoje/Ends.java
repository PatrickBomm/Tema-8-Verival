package com.trabalhoHoje;

public class Ends {

    public String sameEnds(String string) {

        int length = string.length();

        int half = length / 2;

        String left = "";

        String right = "";

        int size = 0;

        for (int i = 0; i < half; i++) {

            left += string.charAt(i);

            right = string.charAt(length - 1 - i) + right;

            if (left.equals(right))

                size = left.length();

        }

        return string.substring(0, size);

    }

}
