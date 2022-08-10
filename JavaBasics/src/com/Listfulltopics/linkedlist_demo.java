package com.Listfulltopics;

import java.util.LinkedList;
import java.util.List;

public class linkedlist_demo {
public static void main(String[] args) {
	List<Object> a = new LinkedList<Object>();
	a.add(1);
	a.add("java");
	a.add(3);
	a.add(5);
	a.add(3);
	System.out.println(a);
	a.add(0, "testing");
	System.out.println(a);
	int size = a.size();
	System.out.println("size:"+size);
	System.out.println("index of java: "+a.indexOf("java"));
	System.out.println("last index of 3: "+a.lastIndexOf(3));
System.out.println("Get index of 0 :"+a.get(0));
System.out.println("contains 3 or not : "+a.contains(3));
System.out.println("index 1 la automation:"+a.set(1, "automtion"));
System.out.println(a);
//a.clear();
//System.out.println(a);
List<Object> b = new LinkedList<Object>();
b.add(1);
b.add("Manual");
b.add(13);
b.add(5);
b.add(3);
a.addAll(b);
System.out.println(a);
a.retainAll(b);
System.out.println("retain all values"+a);
//a.removeAll(b);
//System.out.println(a);
Object[] array = a.toArray();
for (int i = 0; i <array.length; i++) {
	System.out.println(array[i]);
}
String string = a.toString();
System.out.println(string);
}
}
