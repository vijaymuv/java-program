package com.primitive_data_types_change;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.loopsdemo.foreachloopa;

public class collections_change {

	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
	      names.add("A");
	      names.add("B");
	      names.add("C");
	      for (String name : names) {
	    	  System.out.println(name);
			
		}
	   String arr[] = names.toArray(new String[0]);
	   for (String string : arr) {
		   System.out.println(string);
		
	}
	   
	   String[] a = {"a","b","c"}; 
	   List<String> asList = Arrays.asList(a);
	   System.out.println("arrays as list");
		   for (String string : asList) {
			   System.out.println(string);  
			
		}
		   Integer []b= {1,2,3,4};
		 List<Integer> asList2 = Arrays.asList(b);
		  	
	for (int i = 0; i < asList2.size(); i++) {
	System.out.println(i);
		
	}}
		  
	}
	
