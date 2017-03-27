package leetcode;

public class RomanToInteger {
	public int convertRomanToInt(String s) {
		int[] nums = new int[s.length()];
		for(int i = 0; i <s.length(); i++) {
			switch (s.charAt(i)) {
			case 'L':
				nums[i] = 50;
				break;
			case 'X':
				nums[i] = 10;
				break;
			case 'V':
				nums[i] = 5;
				break;
			case 'I':
				nums[i] = 1;
				break;
			}			
		}
		
		int sum = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] < nums[i+1]) sum = sum -  nums[i];
			else sum = sum + nums[i];
		}
		sum = sum + nums[nums.length - 1];
		return sum;
		
	}
}
