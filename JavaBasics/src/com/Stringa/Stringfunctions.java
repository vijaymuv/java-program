package com.Stringa;

public class Stringfunctions {
	public static void main(String[] args) {
		String s = "java or pYthon";
		System.out.println(s);
		System.out.println(s.length());
		boolean equals = s.equals("Java or python");
		System.out.println("equals:" + equals);
		boolean equalsIgnoreCase = s.equalsIgnoreCase("Java or python");
		System.out.println("equals ignore case:" + equalsIgnoreCase);
		String upperCase = s.toUpperCase();
		System.out.println("capital:" + upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println("lowercase:" + lowerCase);
		boolean contains = s.contains("java");
		System.out.println("contains java or not:" + contains);
		boolean startsWith = s.startsWith("java");
		System.out.println("starts with java: " + startsWith);
		boolean endsWith = s.endsWith("python");
		System.out.println("endswith python: " + endsWith);

		String a = "    java is a programming language    ";
		String b = null;
		String trim = a.trim();
		System.out.println("trim is:" + trim);
		String replace = s.replace("Y", "$");
		System.out.println("replaced string: " + replace);
		String concat = s.concat(" or html");
		System.out.println("concat html:" + concat);
		String substring7 = s.substring(7);
		System.out.println("substring of 7: " + substring7);
		String substring4_10 = s.substring(4, 10);
		System.out.println("substring of 4, 10: " + substring4_10);
		String join = String.join("/", "01", "10", "2022");
		System.out.println("joining date:" + join);
		System.out.println(b.isEmpty());

	}

}
