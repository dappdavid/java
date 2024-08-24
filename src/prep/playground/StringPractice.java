package prep.playground;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class StringPractice {

    public static void main(String[] args) {
        String str = "David John";
        Pattern.compile("").splitAsStream(str.toLowerCase()).forEach(System.out::println);

        //Check if string is Isogram (String that contains non-repeatable characters)
        char[] charArray = str.toLowerCase().toCharArray();
        Set<Character> s= new HashSet<>();
        for (int i=0; i < charArray.length; i++){
            if(!s.add(charArray[i])){
                System.out.println("Not a isogram");
                break;
            }
        }

    }

    @Test
    void stringComparisons(){
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "xyz";
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println("s1.equals(s1) : " + s1.equals(s1)); //true
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); //true
        System.out.println("s1.equals(s3) : " + s1.equals(s3)); //false
        System.out.println("s1.equals(s4) : " + s1.equals(s4)); //true
        System.out.println("s4.equals(s5) : " + s4.equals(s5)); //true

        System.out.print("s1 == s1 : ");  System.out.println(s1 == s1); //true
        System.out.print("s1 == s2 : ");  System.out.println(s1 == s2); //true
        System.out.print("s1 == s3 : ");  System.out.println(s1 == s3); //false
        System.out.print("s1 == s4 : ");  System.out.println(s1 == s4); //false
        System.out.print("s4 == s5 : ");  System.out.println(s4 == s5); //false
    }
}
