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
        String currentPath = previousPath + root.val + "->";
        if(root.left == null && root.right == null){
            currentPath = currentPath.substring(0,currentPath.length()-2);
            result.add(currentPath);
        }
        if(root.left != null)
            dfs(root.left, currentPath,result);
        if(root.right != null)
            dfs(root.right,currentPath,result);
    }
}
