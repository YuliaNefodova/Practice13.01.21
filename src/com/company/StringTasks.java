package com.company;

import java.util.regex.Pattern;

public class StringTasks {

    public static boolean getValidString (String string) { //task 10

        return string.matches("^\\D\\d+\\s\\d+\\s\\d+\\D\\d+\\D\\d+");
    }



    public boolean checkHex(String string) { //task 9
        final Pattern REGEX_PATTERN = Pattern.compile("^\\p{XDigit}+$");
        if (REGEX_PATTERN.matcher(string).matches()) {
            System.out.println("True");
            return true;

        } else {
            System.out.println("False");
            return false;
        }
    }

}



