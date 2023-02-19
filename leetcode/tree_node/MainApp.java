package leetcode.tree_node;

public class MainApp {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4,
                                new TreeNode(5),
                                new TreeNode(2,new TreeNode(11,new TreeNode(22),new TreeNode(33)),
                                        new TreeNode(3,new TreeNode(25),new TreeNode(55))))),new TreeNode(44));

        Solution3 s = new Solution3();
        System.out.println(s.preorderTraversal(root));
    }
}
