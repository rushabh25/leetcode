package leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums) set.add(num);
        if(set.size() != nums.length) return true;
        return false;
    }
}
