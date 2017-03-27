package leetcode;

public class HouseRobber {
	public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return nums[0] > nums[1] ? nums[0] : nums[1];
        if(nums[0] > nums[1]) nums[1] = nums[0];
        for(int i = 2; i < nums.length; i++) {
            nums[i] = Math.max(nums[i-1], nums[i] + nums[i-2]);
        }
        return nums[nums.length-1];
    }
}
