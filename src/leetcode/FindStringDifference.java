package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class FindStringDifference {

	public char findTheDifference(String s, String t){
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i =0; i<s.length(); i++){
			if(!map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), 1);
			} else {
				int value = map.get(s.charAt(i));
				map.put(s.charAt(i), ++value);
			}
		}
		 Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		 while (it.hasNext()) {
			 	Map.Entry pair = (Map.Entry)it.next();
		        System.out.println(pair.getKey() + " = " + pair.getValue());
		 }
		for(int i=0; i<t.length(); i++){
			if(!map.containsKey(t.charAt(i))){
				return t.charAt(i);
			} else {
				int value = map.get(t.charAt(i));
				value--;
				if(value == -1) {
					return t.charAt(i);
				}
				map.put(t.charAt(i), value);
			}
		}
		return ' ';
	}
}
