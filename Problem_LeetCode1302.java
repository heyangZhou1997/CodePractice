public class Problem_LeetCode1302 {
    public static void main(String[] args) {

    }
}

class Solution_LeetCode1302 {

    private int maxLayer = 0;

    private int deepestLayerSum = 0;

    public int deepestLeavesSum(TreeNode root) {
        deepestLeavesSum(root, 1);
        return deepestLayerSum;
    }

    private void deepestLeavesSum(TreeNode root, int curLayer) {
        if (root.left == null && root.right == null) {
            if (curLayer > maxLayer) {
                deepestLayerSum = root.val;
                maxLayer = curLayer;
            } else if (curLayer == maxLayer) {
                deepestLayerSum += root.val;
            }
            return;
        }
        if (root.left != null) {
            deepestLeavesSum(root.left, curLayer + 1);
        }
        if (root.right != null) {
            deepestLeavesSum(root.right, curLayer + 1);
        }
    }
}
