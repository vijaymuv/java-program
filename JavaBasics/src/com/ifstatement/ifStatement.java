package com.ifstatement;

public class ifStatement {
	public static void main(String[] args) {
		String s = "java programme";
		switch (s) {
		case "a":
			s.replaceAll("a","1" );
		case "e":
			s.replace("e", "0");
			System.out.println("is same");
			break;
		case "i":
			s.replace("i", "0");
			System.out.println("is same");
			break;
			
		case "o":
			s.replace("o", "0");
			System.out.println("is same");
		case "u":
			s.replace("u", "0");
			System.out.println("is same");
			
			default:
				System.out.println(s);
				break;
		}
		
	}
	}
