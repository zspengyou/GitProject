package chapter3BinaryTreeDivideConquer;

public class MaximumDepthOfBinaryTree {
	private int max = 0;

	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		int currentDepth = Math.max(leftDepth, rightDepth) + 1;
		if (currentDepth > max)
			max = currentDepth;
		return max;
	}
}
