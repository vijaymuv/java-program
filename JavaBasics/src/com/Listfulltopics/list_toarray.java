package com.Listfulltopics;

import java.util.ArrayList;
import java.util.List;

import interviewquans.equals_demo;

public class list_toarray {
	public static void main(String[] args) {
		
		List<Object> l = new ArrayList<Object>();
		l.add(3);
		l.add(26);
		l.add(31);
		System.out.println(l);
		Object[] array = l.toArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);	
		}
		String string = l.toString();
		System.out.println("after convert:"+string);
	}
}
