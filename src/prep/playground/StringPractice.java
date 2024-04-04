package prep.playground;

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
}
