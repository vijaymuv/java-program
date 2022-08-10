package com.Stringa;

public class Stringindexof {
	public static void main(String[] args) {
		String s = "string index of functions";
		char char3 = s.charAt(3);
		System.out.println("character at 3:" +char3);
		int indexOfe = s.indexOf("e");
		System.out.println("index Of e:"+indexOfe);
		int lastIndexOfi = s.lastIndexOf("i");
		System.out.println("last Index Of i:"+lastIndexOfi);
		int lastIndex = s.lastIndexOf("i", 10);
		System.out.println("last index of i / 10: "+lastIndex);
	}

}
