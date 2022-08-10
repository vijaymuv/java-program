package com.Listfulltopics;

import java.util.HashSet;
import java.util.Set;

public class Set_hashset_demo {
public static void main(String[] args) {
	Set<Object> a = new HashSet<Object>();
	
	a.add(1);
	a.add("python");
	a.add(3);
	a.add(5);
	
Set<Object> aa = new HashSet<Object>();
	
	aa.add(1);
	aa.add("python");
	aa.add(13);
	aa.add(15);
	int l = a.size();
	System.out.println("size: "+l);
	System.out.println(a);
	System.out.println("contains or not: "+a.contains("java"));
	System.out.println("is empty:"+a.isEmpty());
	//a.clear();
	//System.out.println(a);
	a.addAll(aa);
	System.out.println(a);
	//a.removeAll(aa);
	//System.out.println("after remove all: "+a);
a.retainAll(aa);
System.out.println("after retain:"+a);
System.out.println("converted array: ");
Object[] array = a.toArray();
for (Object bb : array) {
	System.out.println(bb);
	
}

String string = a.toString();
System.out.println("string is :"+string);

}
}
