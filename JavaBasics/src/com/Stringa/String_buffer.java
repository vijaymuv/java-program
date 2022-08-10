package com.Stringa;

public class String_buffer {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("string buffer");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));
		
		StringBuffer buffer1 = new StringBuffer("string buffer");
		System.out.println(buffer1);
		System.out.println(System.identityHashCode(buffer1));
		
		buffer = buffer.append(" append");
		System.out.println(buffer);
		System.out.println(System.identityHashCode(buffer));

	}

}
