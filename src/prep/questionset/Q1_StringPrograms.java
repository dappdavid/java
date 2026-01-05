package prep.questionset;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Q1_StringPrograms {

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
        String s = "malayalam";
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
