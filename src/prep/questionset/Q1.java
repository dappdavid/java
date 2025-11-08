package prep.questionset;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Q1 {

    //-------String Programs (21)-----------------------
    // reverse a string
    @Test
    void reverseString() {
        String s = "David";
        char[] charArray = s.toLowerCase().toCharArray();
        for (int i = s.toCharArray().length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

    }

    // count number of vowels present in a string (iterative)
    @Test
    void countNumberOfVowelsPresentInString() {
        String str = "David is a handsome guy";
        char[] charArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

    // count number of vowels present in a string (recursive)
    @Test
    void countNumberOfVowelsPresentInString_Recursive() {
        String str = "David is a handsome guy";
        int count = countVowels(str, 0, str.length());
        System.out.println(count);
    }

    int countVowels(String s, int index, int length) {
        if (index == length) {
            return 0;
        } else {
            int count = isVowel(s.charAt(index)) ? 1 : 0;
            return count + countVowels(s, index + 1, length);
        }
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else return false;
    }

    // check whether a string is a palindrome
    @Test
    void checkIfPalindrome() {
        String s = "aziza";
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }

    //remove leading and trailing spaces from a string
    @Test
    void removeLeadingAndTrailingSpaces() {

    }

    // remove all occurrences of a given character from an input string
    @Test
    void removeAllOccurrencesOfACharacter() {
        //Use String builder to construct the new String without the specified character
    }

    //get distinct characters and their count in a string
    @Test
    void distinctCharactersAndTheirCount() {
        String s = "alpha beta gamma delta";
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                continue;
            }
            if (!charCount.containsKey(s.charAt(i)))
                charCount.put(s.charAt(i), 1);
            else charCount.put(s.charAt(i), charCount.get(s.charAt(i)) + 1);
        }
        System.out.println(charCount);

    }

    // print all permutations of string
    @Test
    void allPermutationsOfString() {

    }

    // How to convert an Array to String in Java
    @Test
    void convertArrayToString() {
        // Example for a primitive array
        int[] intArray = {1, 2, 3, 4, 5};
        String intArrayString = Arrays.toString(intArray);
        System.out.println(intArrayString);

        // Example for an object array
        String[] stringArray = {"Hello", "World", "Java"};
        String stringArrayString = Arrays.toString(stringArray);
        System.out.println(stringArrayString);

        //java 8
        String str = Arrays.stream(intArray).mapToObj(String::valueOf).collect(Collectors.joining(""));
        System.out.println(str);

    }

    //checkIfTwoStringsAreAnagrams
    @Test
    void checkIfTwoStringsAreAnagrams() {

    }

    // How can we remove a specific character from a String
    @Test
    void removeCharacterFromAString() {

    }

    // Write a Java program to find the duplicate words and their number of
    // occurrences in a string
    @Test
    void findDuplicateWordsAndOccurrences() {
        // TODO Auto-generated method stub
        String s = "alpha beta gamma alpha beta delta omega";
        Map <String, Integer> wordCount = new HashMap<>();
        for (String str: s.split(" ")) {
            if(!wordCount.containsKey(str)){
                wordCount.put(str, 1);
            } else {
                wordCount.put(str, wordCount.get(str) +1);
            }
        }
        System.out.println(wordCount);

        //use java 8 features
        Map<String, Long> wordCount2 = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(wordCount2);

    }

    // Write a Java program to count the number of words in a string
    @Test
    void countNumberOfWords() {
        // TODO Auto-generated method stub

    }

    // Write a Java program to find duplicate characters in a string
    @Test
    void findDuplicateCharacters() {
        // TODO Auto-generated method stub

    }

    // Write a Java program to reverse a given string with preserving the position
    // of spaces
    @Test
    void reverseStringWhilePreservingSpaces() {
        // TODO Auto-generated method stub

    }

    // How do you find longest substring without repeating characters in the given
    // string
    @Test
    void findLongestSubstringWithoutRepeatingCharacters() {
        // TODO Auto-generated method stub

    }

    // How do you swap two string variables without using third or temp variable
    @Test
    void swapTwoStringsWithoutUsingTemp() {

    }

    // How to remove characters from the first String which are present in the
    // second String
    @Test
    void removeCharactersFromFirstStringThatArePresentInSecond() {
        // TODO Auto-generated method stub

    }

    // How to convert Integer to Roman String
    @Test
    void convertIntegerToRomanNumeral() {
        // TODO Auto-generated method stub

    }

    // How do you check if a given string contains valid parentheses
    @Test
    void checkForValidParantheses() {
        // TODO Auto-generated method stub

    }


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


//-------Math Programs (9)-----------------------

    // find the factorial of an integer
    @Test
    void factorial() {

    }

    // Swap with temp
    @Test
    void swap() {

    }

    // swap two numbers without using a third variable
    @Test
    void swapWithoutTemp() {

    }

    // find power of a number using recursion
    @Test
    void power() {


    }

    // find power of a number without using recursion
    @Test
    void powerBitmanipulation() {

    }

    // check if the given number is a prime number
    @Test
    void checkIfPrime() {


    }

    // print a Fibonacci sequence using while loop
    @Test
    void fibonacci() {

    }

    // find the sum of Fibonacci sequence using recursion
    @Test
    void fibonacciRecursion() {

    }

    // check if a list of integers contains only odd numbers
    @Test
    void checkIfListOnlyContainsOddNumbers() {

    }


//-------Java 8 Programs-----------------------

    // Filter and Print Even Numbers

    // Convert List of Strings to Uppercase


    // Find the First Element in a List


    // FlatMap to Flatten a List of Lists

    // Reduce to Sum All Elements


    // Collect to a Map with the Word Length as Key


    // Peek to Perform an Action Without Altering the Stream


    // Find Any Element in a Stream


    // Count Distinct Elements in a Stream


    // Create a List from a Stream of Integers


    // Skip and Limit to Create a Paginated Result


    // Match Operations


    // Sort a Stream Using a Custom Comparator


    // Concatenate Two Streams


    // Use Collectors to Create a String from a Stream


    // Convert a Stream to an Array


    // Separate Odd And Even Numbers


    // Frequency Of Each Character In String


    // Sort The List In Reverse Order


    // Print Multiples Of 5 From The List


    // Merge Two Unsorted Arrays Into Single Sorted Array


    // Anagram Program In Java 8


// Three Max & Min Numbers From The List
// Min 3 Numbers

// Max 3 Numbers


    // Sum Of All Digits Of A Number


    // Reverse Each Word Of A String


    // Palindrome Program In Java 8


    // Find Strings Which Start With Number


    // Find Duplicate Elements From An Array


    // Last Element Of An Array


    // Age Of Person In Years


    // Fibonacci Series


    // Convert a Map to a List of Entries


    // Grouping By with Downstream Collector


    // Partitioning By with Predicate


    // Finding Maximum and Minimum in a List of Objects


    // Custom Collector to Concatenate Strings with Delimiter


    // Find the Most Frequent Element in a List


    // Stream of Random Numbers


    // Infinite Stream of Fibonacci Sequence


    // Stream from a Pattern Regex


    // Convert Nested Map to List


    // Count the Number of Occurrences of Each Letter in a String


    // Sum Comma Separated Numbers in a String


//-------Multithreading Programs-----------------------
    //How do you create a deadlock scenario programmatically

//-------IO Programs-----------------------

    //Read from file

    //Write to file

    // Write a Java program to append a given string to a text file

    // How do you find the number of characters, words and lines in the given text file

    // How do you find the most repeated word in a text file

    // How to sort a text file

    // How can you find a string in a text file

    // How to replace a specific string in a text file

//-------Matrix Programs-----------------------


//-------Data structures-----------------------
    //Linked List
    //Queue using array
    //Queue using Linked List
    //Stack using array
    //Stack using Linked List
    //Hashmap

//-------Search Algorithms-----------------------
    // Linear search
    // Binary search

//-------Sorting Algorithms-----------------------
    // Bucket sort
    // Bubble sort
    // Selection sort
    // Quick sort
    // Heap sort
    // Merge sort

//-------Design patterns-----------------------
    //Creational : Singleton, Prototype, Factory, AbstractFactory, Builder
    //Behavioral : Chain of responsibility, Command, Interpreter, Iterator,
    // Mediator, Memento, Observer, State, Strategy, Template, Visitor
    //Structural : Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy

//-------Java 17 programs-----------------------
    //Sealed classes
    // Records
    // Pattern matching for instanceof

//-------Pattern Programs-----------------------


//-------HashMap Programs-----------------------


//-------HashSet Programs-----------------------

}
