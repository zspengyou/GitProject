package chapter3BinaryTreeDivideConquer;

//Given a binary tree, find the length of the longest consecutive sequence path.
//
//The path refers to any sequence of nodes from some starting node to any node in the tree along the parent-child connections. 
//The longest consecutive path need to be from parent to child (cannot be the reverse).
public class LongestConsective {
    private int maxLength = 1;
    public int longestConsecutive(TreeNode root) {
        if(root == null)
            return 0;
        findLongestPath(root,1);
        return maxLength;              
    }
    private void findLongestPath(TreeNode root, int currentLength){
        if(currentLength > maxLength)
            maxLength = currentLength;
        if(root.left != null ){
            if(root.left.val == root.val + 1){
                findLongestPath(root.left, currentLength + 1);
            }else{
                findLongestPath(root.left, 1); 
            }
        }
        if(root.right != null ){
            if(root.right.val == root.val + 1){
                findLongestPath(root.right, currentLength + 1);
            }else{
                findLongestPath(root.right, 1); 
            }
        }
    }
    
}
