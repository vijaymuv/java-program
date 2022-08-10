package interviewquans;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class repetative_prg {

	public static void main(String[] args) {
		String s = "of the people by the people for the people";
		char[] charArray = s.toCharArray();
		Map<Character,Integer> m = new LinkedHashMap<Character, Integer>();
		for (char c : charArray) {
			if (m.containsKey(c)) {
				Integer v = m.get(c);
				m.put(c, v+1);
			}else {
				m.put(c, 1);
			}
		}
			Set<Entry<Character,Integer>> entry = m.entrySet();	
			for (Entry<Character, Integer> e : entry) {
				if (e.getValue()>1) {
					System.out.println(e);
					
				}
			}

	}
	}
