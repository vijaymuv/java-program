package com.Stringa;

public class Splitarray {
	public static void main(String[] args) {
		String s = "welcome to string array";
		String s1 = "welcome to string array";
		String[] split = s.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		System.out.println("In foreach loop: ");
		for (String a : split) {
			System.out.println(a);
		}
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		s=s+" in java";
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}

}
