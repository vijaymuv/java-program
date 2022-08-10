package com.Listfulltopics;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_linkedhash_set_treeset {
	public static void main(String[] args) {
		Set<Object> a = new LinkedHashSet<Object>();
		
		a.add(1);
		a.add("python");
		a.add(3);
		a.add(5);
		a.add(5);
		System.out.println(a);
		
Set<Integer> b = new TreeSet<Integer>();
		
		b.add(1);
		b.add(1);
		b.add(1);
		b.add(7);
		System.out.println(b);
	}

}
