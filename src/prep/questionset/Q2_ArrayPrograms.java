package prep.questionset;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Q2_ArrayPrograms {

    //-------Array Programs (14)-----------------------

    // 0s followed by 1s (sort array)
    @Test
    public void arrayProgram1() {
        int[] arr = {1, 0, 1, 1, 1, 1, 1, 0, 1, 0};
        String collected = Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining());
        System.out.println(collected);

        //count the number of zeroes
        //add same number of zeroes at the beginning of the array

    }

    // How to find the missing number in integer array of 1 to 100
    @Test
    void findMissingNumber() {


    }

    // How to find duplicate number on Integer array in Java
    @Test
    void findDuplicateNumber() {

    }

    // How to check if array contains a number
    @Test
    void checkIfArrayContainsANumber() {

    }

    // How to find largest and smallest number in unsorted array
    @Test
    void findLargestAndSmallestNumber() {

    }

    // How to find all pairs on integer array whose sum is equal to given number
    @Test
    void allPairsWhoseSumIsEqualToGivenNumber() {

    }

    // How to find repeated numbers in an array if it contains multiple duplicates
    @Test
    void findRepeatedNumbers() {
        // TODO Auto-generated method stub

    }

    // Write a program to remove duplicates from array in Java
    @Test
    void removeDuplicates() {
        // TODO Auto-generated method stub

    }

    // How find the first repeating element in an array of integers
    @Test
    void findFirstRepeatingElement() {
        // TODO Auto-generated method stub

    }

    // How to find first non-repeating element in array of integers
    @Test
    void findFirstNonRepeatingElement() {
        // TODO Auto-generated method stub

    }

    // How to find top two numbers from an integer array
    @Test
    void findTopTwoNumbers() {
        // TODO Auto-generated method stub

    }

    // How to reverse array in place
    @Test
    void reverseArrayInPlace() {

    }

    // Write Java program that checks if two arrays contain the same elements
    @Test
    void checkif2ArraysHaveSameElements() {
        // TODO Auto-generated method stub

    }

    // How do you find the second largest number in an array
    @Test
    void secondLargestNumberInArray() {
        // TODO Auto-generated method stub

    }
}
