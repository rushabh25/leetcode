package leetcode;

public class TwoSumWithSortedInputArray {
	public int[] twoSum(int[] numbers, int target) {
        
        int i = 0;
        int j = numbers.length-1;
        int[] output = new int[2];
        while(true) {
            if(numbers[i] + numbers[j] == target) {
                output[0] = i+1;
                output[1] = j+1;
                break;
            }
            if(numbers[i] + numbers[j] > target) {
                j = j - 1;
            } else {
                i = i + 1;
            }
        }
        return output;
    }
}
