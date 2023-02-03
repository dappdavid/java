package com.java.playground;

import java.util.Hashtable;

public class Programming1 {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "abc";
		String s3 = "xyz";
		String s4 = new String("abc");
		String s5 = new String("abc");
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s4.equals(s5));

		System.out.println(s1 == s1);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s4 == s5);

		Hashtable<Student, String> h = new Hashtable<Student, String>();
		Student s = new Student();
		h.put(s, "");

	}

}

class Student {
	String name;
	int age;
}
