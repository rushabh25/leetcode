package leetcode;



//For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].


public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		
		for(int i = nums.length -1; i >= 0; i--) {
			
			if(nums[i] == 0 && i!= nums.length - 1) {
				
				for(int j = i; j < nums.length - 1; j++) {
					
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
				
			}
			
		}
		
		for(int i = 0; i <= nums.length - 1; i++) {
			System.out.println(nums[i]);
		}
	}
}
