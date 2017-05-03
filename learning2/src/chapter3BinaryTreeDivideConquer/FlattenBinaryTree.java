package chapter3BinaryTreeDivideConquer;

public class FlattenBinaryTree {
	public void flatten(TreeNode root) {
		if (root == null)
			return;
		helper(root);
	}
	// helper will move the left child to right, link the right child to the end of left child

	private TreeNode helper(TreeNode root) {
		TreeNode leftChild = root.left;
		TreeNode rightChild = root.right;
		TreeNode end = root;
		if (leftChild != null) {
			TreeNode leftEnd = helper(leftChild);
			end.left = null;
			end.right = leftChild;
			end = leftEnd;
		}
		if (rightChild != null) {
			TreeNode rightEnd = helper(rightChild);
			end.right = rightChild;
			end = rightEnd;
		}
		return end;
	}
	public static void main(String[] args){
		System.err.println("remember to break the old link");
	}
}
