package com.programs.java8;

import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProgramsJava8 {
    public static void main(String[] args) {

        //Sum all the digits of a string
        String numberString = "456";
        int sum = numberString.chars() // Create an IntStream
                .map(Character::getNumericValue) // Convert each char to a numeric value
                .sum(); // Sum all the numeric values

        //String array to String
        String[] stringArray = {"Java", "Python", "C++"};
        String result = Arrays.stream(stringArray)
                .collect(Collectors.joining(", "));

        //Int array to String
        int[] intArray = {1, 2, 3, 4, 5};
        String res = Arrays.stream(intArray)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        //find first non-repeated character in a string
        String input = "swiss";
        Character firstNonRepeated = input.chars() // Creates an IntStream
                .mapToObj(c -> (char) c) // Converts IntStream to Stream<Character>
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Collects characters and their counts into a LinkedHashMap
                .entrySet()
                .stream() // Streams the entry set of the map
                .filter(entry -> entry.getValue() == 1) // Filters for characters with a count of 1
                .map(Map.Entry::getKey) // Maps to the character
                .findFirst() // Finds the first character that matches the criteria
                .orElse(null); // Returns null if no character matches

    }
}
