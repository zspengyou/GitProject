package chapter3BinaryTreeDivideConquer;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null)
            return result;
        dfs(root, "", result);
        return result;
    }

    private void dfs(TreeNode root, String previousPath, List<String> result) {

    }
}
