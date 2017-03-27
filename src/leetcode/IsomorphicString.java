package leetcode;

public class IsomorphicString {
	public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] s_arr = new int[128];
        int[] t_arr = new int[128];
        
        for(int i = 0; i < s.length(); i++) {
            if(s_arr[(int)s.charAt(i)] != t_arr[(int)t.charAt(i)]) return false;
            s_arr[(int)s.charAt(i)] = i + 1;
            t_arr[(int)t.charAt(i)] = i + 1;
        }
        return true;
    }
}
