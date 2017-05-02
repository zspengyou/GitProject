package chapter3BinaryTreeDivideConquer;

public class SubTreeWithMaximumAverage {

    public static NodeSum emptyNodeSum = new NodeSum(null, 0, 0);

    public TreeNode findSubtree2(TreeNode root) {
        if (root == null)
            return null;
        NodeSum result = findMaxAverage(root);
        return result.node;
    }

    private NodeSum findMaxAverage(TreeNode root) {
        if (root == null)
            return emptyNodeSum;
        NodeSum leftResult = findMaxAverage(root.left);
        NodeSum rightResult = findMaxAverage(root.right);
        int currentNum = leftResult.nodeNum + rightResult.nodeNum + 1;
        int currentSum = leftResult.nodeSum + rightResult.nodeSum + root.val;
        NodeSum currentResult = new NodeSum(root, currentNum, currentSum);
        NodeSum result = getMax(leftResult, rightResult, currentResult);
        return result;

    }

    private NodeSum getMax(NodeSum left, NodeSum right, NodeSum root) {
        NodeSum tmp = getMax(left, right);
        NodeSum result = getMax(tmp, root);
        return result;
    }

    private NodeSum getMax(NodeSum first, NodeSum second) {
        if (first.nodeNum == 0)
            return second;
        if (second.nodeNum == 0)
            return first;
        double firstAvg = first.nodeSum / (double) first.nodeNum;
        double secondAvg = second.nodeSum / (double) second.nodeNum;
        if (firstAvg >= secondAvg)
            return first;
        else
            return second;
    }

    static class NodeSum {
        public int nodeNum;
        public int nodeSum;
        public TreeNode node;

        public NodeSum(TreeNode node, int nodeNum, int nodeSum) {
            this.node = node;
            this.nodeNum = nodeNum;
            this.nodeSum = nodeSum;
        }
    }

}
