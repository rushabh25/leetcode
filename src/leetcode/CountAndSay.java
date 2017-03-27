package leetcode;

import java.util.HashMap;

public class CountAndSay {
	public String countAndSay(int n) {
		String s = String.valueOf(n);
		String output = "";
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		
		int sum = 1;
		if(s.length() == 1) return "one "+n;
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				sum = sum + 1;
				if(i+1 == s.length()-1) {
					
					output += map.get(sum) + " " + s.charAt(i+1);
					return output;
				}
			} else {
				output += map.get(sum) + s.charAt(i);
				sum = 1;
				
				
				if(i+1 == s.length()-1) {
					output += map.get(sum) + " " + s.charAt(i+1);
					return output;
				}
			}
			
		}
		return null;
	}
}
