package chapter3BinaryTreeDivideConquer;

public class BalancedBinaryTree {
//http://www.lintcode.com/en/problem/balanced-binary-tree/
	//TODO
	private int min = Integer.MAX_VALUE;
	private int max = Integer.MIN_VALUE;

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		helper(root, 1);
		if (max - min > 1)
			return false;
		return true;
	}

	private void helper(TreeNode root, int currentDepth) {
		if (root.left == null) {
			if (min > currentDepth)
				min = currentDepth;
			if (max < currentDepth)
				max = currentDepth;
		} else {
			helper(root.left, currentDepth + 1);
		}
		if (root.right == null) {
			if (min > currentDepth)
				min = currentDepth;
			if (max < currentDepth)
				max = currentDepth;
		} else {
			helper(root.right, currentDepth + 1);
		}

	}

}
