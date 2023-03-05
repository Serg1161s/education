package leetcode.tree_node;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;
        int sum = root.val;

        if (root.val == targetSum && root.left == null && root.right == null) return true;


        return hasPathSum(root.left, targetSum - root.val) || hasPathSum( root.right,targetSum-root.val);
    }
}
