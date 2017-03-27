package leetcode;

public class ValidAnagram {
	 public boolean isAnagram(String s, String t) {
	        if(s.length() != t.length()) return false;
	        int[] alphabets = new int[128];
	        for(int i = 0; i < s.length(); i++){
	            alphabets[(int)s.charAt(i) - 97] = alphabets[(int)s.charAt(i) - 97] + 1;
	            alphabets[(int)t.charAt(i) - 97] = alphabets[(int)t.charAt(i) - 97] - 1;
	        }
	        for(int letter: alphabets) {
	            if(letter != 0) return false;
	        }
	        return true;
	    }
}
