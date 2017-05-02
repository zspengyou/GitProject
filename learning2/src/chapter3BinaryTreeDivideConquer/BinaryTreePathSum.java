package chapter3BinaryTreeDivideConquer;

import java.util.ArrayList;
import java.util.List;

//http://www.lintcode.com/en/problem/binary-tree-path-sum/
//Given a binary tree, find all paths that sum of the nodes in the path equals to a given number target.

//A valid path is from root node to any of the leaf nodes.
public class BinaryTreePathSum {
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
            return result;
        List<Integer> tmp = new ArrayList<>();
        dfs(root, target, 0, result, tmp);
        return result;
    }

    private void dfs(TreeNode root, int target, int previousSum, List<List<Integer>> result, List<Integer> tmp) {
        if (root == null) {
            return;
        }
        tmp.add(root.val);
        if (root.left == null && root.right == null) {
            if (previousSum + root.val == target)
                result.add(new ArrayList<>(tmp));
        }
        dfs(root.left, target, previousSum + root.val, result, tmp);
        dfs(root.right, target, previousSum + root.val, result, tmp);
        tmp.remove(tmp.size() - 1);
    }
}
