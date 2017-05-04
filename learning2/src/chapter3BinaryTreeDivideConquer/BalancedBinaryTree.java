package chapter3BinaryTreeDivideConquer;

public class BalancedBinaryTree {
	//http://www.lintcode.com/en/problem/balanced-binary-tree/
	//TODO

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		int length = helper(root);
		if(length == -1){
			return false;
		}
		return true;
	}

	private int helper(TreeNode root) {
		if (root == null)
			return 0;
		int leftDepth = helper(root.left);
		int rightDepth = helper(root.right);
		if (leftDepth == -1 || rightDepth == -1 || Math.abs(leftDepth - rightDepth) > 1)
			return -1;
		return Math.max(leftDepth, rightDepth) + 1;
	}

}
