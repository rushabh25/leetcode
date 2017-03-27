package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BTLeafPaths {
	public List<String> binaryTreePaths(TreeNode root) {
		 /* Solution 1: BFS using queues       
		        if(root == null) return new ArrayList<String>();
		        List<String> outputList = new ArrayList<String>();
		        Queue<TreeNode> queue = new LinkedList<TreeNode>();
		        Queue<String> queueStr = new LinkedList<String>();
		        queue.add(root);
		        queueStr.add(root.val + "");
		        
		        while(queue.size() != 0) {
		            int size = queue.size();
		            
		            for(int i = 0; i < size; i++) {
		                TreeNode node = queue.poll();
		                String tempString = queueStr.poll();
		                
		                if(node.right == null && node.left == null) {
		                    outputList.add(tempString);
		                }
		                if(node.left != null) {
		                    queueStr.add(tempString + "->" + node.left.val);
		                    queue.add(node.left);
		                }
		                if(node.right != null) {
		                    queueStr.add(tempString + "->" + node.right.val);
		                    queue.add(node.right);
		                }
		                
		            }
		        }
		        return outputList;
		  */
		        Stack<TreeNode> stack = new Stack<TreeNode>();
		        StringBuilder string = new StringBuilder();
		        List<String> outputList = new ArrayList<String>();
		        if(root == null) return new ArrayList<String>();
		        TreeNode node = root;
		        while(node != null) {
		            stack.push(node);
		            string.append(node);
		            node = node.left;
		        }
		        
		        while(stack.size() != 0) {
		            node = stack.pop();
		            
		            if(node.right != null) {
		                node = node.right;
		            }
		            while(node != null) {
		                stack.push(node);
		                string.append(node);
		                node = node.left;
		            }
		            
		        }
		        return outputList;
		  
		    }
}
