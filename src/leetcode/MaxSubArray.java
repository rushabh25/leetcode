package leetcode;

public class MaxSubArray {
	public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        int[][] dp = new int[nums.length+1][2];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            dp[i+1][0] = nums[i] + dp[i][0];
            dp[i+1][1] = Math.max(dp[i][1] + nums[i], nums[i]);
            int temp = Math.max(dp[i+1][0], dp[i+1][1]);
            if(temp > max) {
                max = temp; 
            }
        }
        return max;
    }
}
