package com.Listfulltopics;

import java.util.ArrayList;
import java.util.List;

public class listmethodsfull{
	public static void main(String[] args) {
	List<Object> l = new ArrayList<Object>();
	l.add("java");
	l.add(3);
	l.add(0,"First");
	l.add(0,"second");
	l.add(26.08);
	l.add(null);
	l.add("python");
	l.add("html");
	l.add(null);
	l.add(3);
	System.out.println(l);
	int size = l.size();
	System.out.println("size of list:"+size);
	int index = size - 1;
	System.out.println("index of list:"+index);
	int indexOfnull = l.indexOf(null);
	System.out.println("index Of null: "+indexOfnull);
	int lastIndexOfnull = l.lastIndexOf(null);
	System.out.println("last Index Of null:"+lastIndexOfnull);
	int indexOfjava1 = l.indexOf("java1 ");
	System.out.println("unknown value:"+indexOfjava1);
	boolean contains = l.contains("First");
	System.out.println("Contains first or not:"+contains);
	Object object = l.get(0);
	System.out.println("0 index value:"+object);
	}
}

	