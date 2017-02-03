package leetcode;

import java.util.Arrays;
import java.util.List;

public class Tester {

	public static void main(String[] args) {

		
		BinaryTreeSumOfLeftLeaves tree = new BinaryTreeSumOfLeftLeaves(10);
		tree.insert(9);
		tree.insert(20);
		tree.insert(15);
		tree.insert(25);
		tree.sumLeftLeaves();
		
	}

}
