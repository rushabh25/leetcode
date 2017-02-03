package leetcode;

public class ReverseString {

	public String reverse(String s){
		int n = s.length() / 2;
		char[] arr = s.toCharArray();
		for(int i = 1; i<=n; i++) {
			char temp = arr[i-1];
			arr[i-1] = arr[s.length()-i];
			arr[s.length()-i] = temp;
		}
		return String.valueOf(arr);
	}
}
