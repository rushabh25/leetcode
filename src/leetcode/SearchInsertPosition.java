package leetcode;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end) {
            int mid = (start + end)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        // here start > end
        if(end == -1) end = 0;
        if(nums[end] > target) return (start-1 < 0) ? 0 : start - 1;
        return end+1;
    }
}
