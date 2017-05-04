package chapter4BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import chapter3BinaryTreeDivideConquer.TreeNode;

public class BinaryTreeLevelOrderTraversal {
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int size = queue.size();
			ArrayList<Integer> tmpResult = new ArrayList<Integer>();
			for (int i = 0; i < size; i++) {
				TreeNode treeNode = queue.poll();
				tmpResult.add(treeNode.val);
				if (treeNode.left != null)
					queue.offer(treeNode.left);
				if (treeNode.right != null)
					queue.offer(treeNode.right);
			}
			result.add(tmpResult);
		}
		return result;

	}

	public ArrayList<ArrayList<Integer>> levelOrder2(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return result;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			ArrayList<TreeNode> currentLevelNodes = new ArrayList<TreeNode>();
			ArrayList<Integer> tmpResult = new ArrayList<Integer>();
			while (!queue.isEmpty()) {
				TreeNode treeNode = queue.poll();
				currentLevelNodes.add(treeNode);
				tmpResult.add(treeNode.val);
			}
			result.add(tmpResult);
			for (TreeNode treeNode : currentLevelNodes) {
				if (treeNode.left != null)
					queue.offer(treeNode.left);
				if (treeNode.right != null)
					queue.offer(treeNode.right);
			}
		}
		return result;
	}

}
