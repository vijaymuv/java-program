package com.Listfulltopics;

import java.util.ArrayList;
import java.util.List;

public class RenainingListmethod {
	public static void main(String[] args) {
		List<Object> a = new ArrayList<Object>();
		a.add(1);
		a.add(3);
		a.add(15);
		
		System.out.println(a);
		System.out.println("is a empty or not:"+a.isEmpty());
		//a.clear();
		//System.out.println(a);
		System.out.println("A Values:"+a);
		List<Object> b = new ArrayList<Object>();
		b.add(11);
		b.add(30);
		b.add(15);
		b.set(0,"Java");
		System.out.println("b values:"+b);
		
		a.add(b);
		System.out.println("after adding a and b: "+a);
		a.retainAll(b);
		System.out.println("after retaining a and b:"+a);
		a.removeAll(b);
		System.out.println("after remove all:" +b);
	}
	

}
