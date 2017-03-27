package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArrays {
	public int[] intersect(int[] nums1, int[] nums2) {
		/*
        -- using hashset and O(n) time complexity
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> outputList = new HashSet<>();
        for(int num: nums1) {
            set.add(num);
        }
        for(int num: nums2) {
            if(set.contains(num)) outputList.add(num);
        }
        int[] arr = new int[outputList.size()];
        int i = 0;
        for(int val: outputList) {
            arr[i] = val;
            i = i + 1;
        }
        return arr;
        */
        Arrays.sort(nums2);
        HashSet<Integer> outputList = new HashSet<Integer>();
        for(int num: nums1) {
            if(binarySearch(nums2, num)) outputList.add(num);
        }
        int[] arr = new int[outputList.size()];
        int i = 0;
        for(int val: outputList) {
            arr[i] = val;
            i = i + 1;
        }
        return arr;
    }
        
        
        
        // using binary search
        public boolean binarySearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;
            while(start <= end) {
                int mid = (start + end)/2;
                if(arr[mid] == target) return true;
                if(arr[mid] < target) {
                    start = mid + 1;
                }
                else end = mid - 1;
            }
            return false;
        
    }
}
