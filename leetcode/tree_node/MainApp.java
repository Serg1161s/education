package leetcode.tree_node;

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

//        Solution3 s = new Solution3();
//        System.out.println(s.preorderTraversal(root));
        SolutionInOrder sPO = new SolutionInOrder();
        System.out.println(sPO.inorderTraversal(root));
        InorderTraversal s = new InorderTraversal();
        System.out.println(s.inorderTraversal(root));
    }
}
