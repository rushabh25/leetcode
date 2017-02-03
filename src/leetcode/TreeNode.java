package leetcode;

public class TreeNode {
	private int data;
	private TreeNode right;
	private TreeNode left;
	public int sum;
	
	
	public TreeNode(int data){
		this.setData(data);
		setLeft(null);
		setRight(null);
	}
	
	public void insert(int data, TreeNode root) {
		
		TreeNode newNode = new TreeNode(data);
		if(root == null) {
			root.setData(data);
			root.setRight(null);
			root.setLeft(null);
			return;
		}
		TreeNode current = root;
		
		while(current != null) {
			
			if(data < current.getData()) {
				if(current.getLeft() != null) {
					current = current.getLeft();
				} else {
					current.setLeft(newNode);
					return;
				}
			} else {
				if(current.getRight() != null) {
					current = current.getRight();
				} else {
					current.setRight(newNode);
					return;
				}
			}
			

	}
	

	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
}
