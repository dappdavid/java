package com.playground;

import java.util.regex.Pattern;

public class StringPractice {

    public static void main(String[] args) {
        String str = "David John";
        Pattern.compile("").splitAsStream(str.toLowerCase()).forEach(System.out::println);

    }
}
