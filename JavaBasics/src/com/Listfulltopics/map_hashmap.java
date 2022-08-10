package com.Listfulltopics;

import java.util.*;
import java.util.Map.Entry;

public class map_hashmap {
	public static void main(String[] args) {
		Map<Integer, String> a = new TreeMap<Integer, String>();
		a.put(2, null);
		a.put(1, null);

		a.put(2, "python");		
		a.put(0, null);
		a.put(3, "abc");

		a.put(50, "hi");

		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty()+": (is empty or not)");
	//a.clear();
		//System.out.println("present or not: "+a.containsKey(null));
	System.out.println("contains value or not:"+a.containsValue("java"));
	System.out.println(a.get(90));
	Map<Character, String> b = new HashMap<Character, String>();
b.put(null, null);
b.put(null, "o");
System.out.println(b);
Set<Integer> keySet = a.keySet();
System.out.println(keySet);
Collection<String> values = a.values();
System.out.println(values);
for (String aa : values) {
	System.out.println(aa);
	
	Set<Entry<Integer, String>> entrySet = a.entrySet();
	System.out.println("entry:" +entrySet);
	for (Entry<Integer, String> aaq : entrySet) {
		System.out.println(aaq);
	}
}
}
}
