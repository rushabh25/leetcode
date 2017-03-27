package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class LongestPalindromeSubstring {

	public HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	public String GetLongestPalindromeSubstring(String input){
		for(int i = 0; i<input.length(); i++){
			for(int j=input.length()-1; j>=i; j--) {
				String reqdString = input.substring(i, j+1); 
				if(isPalindrome(reqdString)){
					if((map.get(reqdString) == null ? 0 : map.get(reqdString)) < reqdString.length()) {
						map.put(reqdString, reqdString.length());
					}
				}
			}
		}
		if(map.size() == 0) return null;

		Map.Entry<String, Integer> maxEntry = null;

		for (Map.Entry<String, Integer> entry : map.entrySet())
		{
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
		    {
		        maxEntry = entry;
		    }
		}
		return maxEntry.getKey();
		
	}
	
	public boolean isPalindrome(String input) {
		int size = input.length() / 2;
		for(int i = 0 ; i < size; i++) {
			if(input.charAt(i) != input.charAt(input.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}


