package prep.playground;

import java.util.Hashtable;

public class Programming1 {

    public static void main(String[] args) {



        Hashtable<Student, String> h = new Hashtable<Student, String>();
        Student s = new Student();
        h.put(s, "");

    }

}

class Student {
    String name;
    int age;
}
