package leetcode;

public class MissingNumber {
	public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = (size * (size + 1))/2;
        int actualSum = 0;
        for(int num: nums) {
            actualSum += num;
        }
        return sum - actualSum;
    }
}
