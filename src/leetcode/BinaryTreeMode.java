package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;

public class BinaryTreeMode {
	public int[] findMode(TreeNode root) {
        if(root == null) return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> outputList = new ArrayList<Integer>();
        queue.add(root);
        int maxOccurence = 1;
        
        while(queue.size() != 0){
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                Integer value = map.get(node.val);
                if(value == null) map.put(node.val, 1);
                else {
                    if(value+1 > maxOccurence) {
                        maxOccurence = value+1;
                        map.put(node.val, value + 1);
                    } else {
                        map.put(node.val, value + 1);
                    }
                }
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }
        }
        for(Entry<Integer, Integer> entry: map.entrySet()){
            if(maxOccurence == entry.getValue()) outputList.add(entry.getKey());
        }
        int[] outputArr = new int[outputList.size()];
        for(int i = 0; i <outputList.size(); i++){
            outputArr[i] = outputList.get(i);
        }
        return outputArr;
    }
}
