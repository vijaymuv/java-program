package com.Stringa;

public class Stringbufferfunctions {
	public static void main(String[] args) {
	StringBuffer s = new StringBuffer("string buffer");
	System.out.println("append:" +s.append(" functions"));
	System.out.println("insert :"+s.insert(0, "2022 "));
	System.out.println("replace: "+s.replace(4, 5, "june"));
	System.out.println("delete func:"+s.delete(4, 8));
	System.out.println("reverse: "+s.reverse());
	}

}
