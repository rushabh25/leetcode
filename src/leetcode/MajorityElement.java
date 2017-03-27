package leetcode;

import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(nums.length == 1) return nums[0];
        for(int num: nums) {
            if(!(map.containsKey(num))){
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
                if(map.get(num) > nums.length/2) return num;
            }
        }
        return -1;
    }
}
