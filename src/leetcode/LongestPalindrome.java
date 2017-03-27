package leetcode;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
        boolean containsOdd = false;
        int[] arr = new int[128];
        int palindromeLength = 0;
        for(int i=0; i < s.length(); i++){
            arr[(int)s.charAt(i)]++;
        }
        for(int val:arr) {
            if(val%2==0) palindromeLength += val;
            if(val%2==1) {
                palindromeLength += val-1;
                containsOdd = true;
            }
        }
        return containsOdd ? palindromeLength + 1 : palindromeLength;
    }
}
