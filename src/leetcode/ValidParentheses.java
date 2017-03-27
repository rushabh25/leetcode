package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
        if(s.length() == 1) return false;
        Stack<Character> stack = new Stack<Character>();
        HashSet<Character> set = new HashSet<Character>(Arrays.asList('{', '[', '('));
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                stack.push(s.charAt(i));
            } else {
                if(stack.size() == 0) return false;
                char output = stack.pop();
                if((output == '{' && s.charAt(i) != '}') || (output == '[' && s.charAt(i) != ']') || (output == '(' && s.charAt(i) != ')')) return false;
            }
        }
        if(stack.size() == 0) return true;
        return false;
    }
}
