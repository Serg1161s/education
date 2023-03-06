package leetcode.tree_node.is_same_tree;

import leetcode.tree_node.TreeNode;

public class MainApp {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode left1 = new TreeNode(4);
        TreeNode right1 = new TreeNode(5);
        TreeNode left2 = new TreeNode(6);
        TreeNode right2 = new TreeNode(7);

        root.left = left;
        root.right = right;

        left.left = left1;
        left.right = right1;

        right.left = left2;
        right.right = right2;

        TreeNode root1 = new TreeNode(1);
        TreeNode left11 = new TreeNode(2);
        TreeNode right11 = new TreeNode(3);
        TreeNode left12 = new TreeNode(4);
        TreeNode right12 = new TreeNode(5);
        TreeNode left22 = new TreeNode(6);
        TreeNode right22 = new TreeNode(1);

        root1.left = left11;
        root1.right = right11;

        left11.left = left12;
        left11.right = right12;

        right11.left = left22;
        right11.right = right22;

        SolutionIsSameTree solutionIsSameTree = new SolutionIsSameTree();
        System.out.println(solutionIsSameTree.isSameTree(root,root1));


    }
}
