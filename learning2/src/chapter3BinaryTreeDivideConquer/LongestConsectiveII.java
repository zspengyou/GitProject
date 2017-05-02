package chapter3BinaryTreeDivideConquer;

//Given a binary tree, find the length of the longest consecutive sequence path.
//
//The path refers to any sequence of nodes from some starting node to any node in the tree along the parent-child connections. 
//The longest consecutive path need to be from parent to child (cannot be the reverse).
public class LongestConsectiveII {

    public int longestConsecutive(TreeNode root) {
        if(root == null)
            return 0;
        int result = findLongestPath(root,1);
        return result;              
    }
    private int findLongestPath(TreeNode root, int currentLength){
        int leftLength = 0;
        int rightLength = 0;
        if(root.left != null){
            if(root.val + 1 == root.left.val){
                leftLength = findLongestPath(root.left, currentLength + 1);
            }else{
                leftLength = findLongestPath(root.left, 1);
            }
        }
        if(root.right != null){
            if(root.val + 1 == root.right.val){
                rightLength = findLongestPath(root.right, currentLength + 1);
            }else{
                rightLength = findLongestPath(root.right, 1);
            }
        }
        return Math.max(currentLength, Math.max(leftLength, rightLength));
    }
    
}
