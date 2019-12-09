package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Valid emailValid = (str) -> {
            Pattern pattern;
            Matcher matcher;

            final String EMAIL_PATTERN =
                    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
                            "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

                pattern = Pattern.compile(EMAIL_PATTERN);
                matcher = pattern.matcher(str);
                return matcher.matches();
        };

        Valid phoneValid = (str) -> {
            Pattern pattern;
            Matcher matcher;

            final String PHONE_PATTERN =
                    "^(\\s*)?(\\+)?([- _():=+]?\\d[- _():=+]?){10,14}(\\s*)?$";

            pattern = Pattern.compile(PHONE_PATTERN);
            matcher = pattern.matcher(str);
            return matcher.matches();
        };

//        System.out.println(emailValid.isValid("student86rv@gmail.com"));
//        System.out.println(phoneValid.isValid("+380(67)777-7-777"));


        List<String> list = new ArrayList<>();
        list.add("enuHFGVBnewovgfuwbrHNVI");
        list.add("rghbjud");
        list.add("rd");

        list.stream().filter((str) -> str.length() >= 10).forEach(System.out::println);
    }
}