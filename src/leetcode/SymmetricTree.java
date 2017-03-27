package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return true;
        if(root.right == null && root.left == null) return true;
        if(root.left == null || root.right == null) return false;
        queue.add(root.left);
        queue.add(root.right);
        
        while(queue.size() != 0){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode left = queue.poll();
                TreeNode right = queue.poll();
                if(left == null && right == null) break;
                if((left == null && right != null) || (left != null && right == null)) return false;
                if(left.val != right.val) return false;
                queue.add(left.left);
                queue.add(right.right);
                queue.add(left.right);
                queue.add(right.left);
            }
        }
        return true;
    }
}
