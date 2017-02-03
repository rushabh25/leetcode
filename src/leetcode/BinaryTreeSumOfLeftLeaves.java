package leetcode;

public class BinaryTreeSumOfLeftLeaves {

	public TreeNode root;
	public void insert(int data){
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
	
	
	public void sumLeftLeaves(){
		System.out.println(root.sumLeftLeaves());
	}
	
	public BinaryTreeSumOfLeftLeaves(int data){
		TreeNode newNode = new TreeNode(data);
		root = newNode;
	}
	
	public BinaryTreeSumOfLeftLeaves(TreeNode root){
		this.root = root;
	}
	
	public int sumOfLeftLeaves(TreeNode root){
		
		if(root.getLeft() != null) {
			return root.getLeft().getData() + sumOfLeftLeaves(root.getLeft());
		}
		if(root.getRight() != null) {
			return 0 + sumOfLeftLeaves(root.getRight());
		}
		return 0;
	}
	
	class TreeNode {
		private int data;
		private TreeNode right;
		private TreeNode left;
		
		public TreeNode(int data){
			this.setData(data);
			setLeft(null);
			setRight(null);
		}
		
	

		public int sumLeftLeaves() {
			if(root == null) return 0;
			int sum = 0;
			if(this.left != null) {
				if(this.left.left == null && this.left.right == null) sum += this.left.data;
				else sum+=this.left.sumLeftLeaves();
			} 
			if(this.right != null) sum+=this.right.sumLeftLeaves();
			return sum;
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
}
