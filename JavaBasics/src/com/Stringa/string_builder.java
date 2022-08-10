package com.Stringa;

public class string_builder {
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("string builder");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		
		StringBuilder builder1 = new StringBuilder("string builder");
		System.out.println(builder1);
		System.out.println(System.identityHashCode(builder1));
		
		builder = builder.append(" append");
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
	}

}
