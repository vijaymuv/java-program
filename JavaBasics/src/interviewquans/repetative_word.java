package interviewquans;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class repetative_word {

	public static void main(String[] args) {
String s = "of the people by the people for the people";
String[] words = s.split(" ");
Map<String,Integer> map = new LinkedHashMap<String, Integer>();
for (String word : words) {
	if (map.containsKey(word)) {
		Integer value = map.get(word);
		map.put(word, value+1);
		
	}else {
		map.put(word,1);
	}
}   
Set<Entry<String, Integer>> entrySet = map.entrySet();
for (Entry<String, Integer> entry : entrySet) {
	if (entry.getValue()>1) {
		System.out.println(entry);
		
	}

	}
	}
}
