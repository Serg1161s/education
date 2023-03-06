package leetcode.tree_node.is_same_tree;

import leetcode.tree_node.TreeNode;

import java.util.Stack;

public class SolutionIsSameTree {

    protected boolean isSameTree(TreeNode p, TreeNode q) {

        Stack <TreeNode> stack1 = new Stack<>();
        Stack <TreeNode> stack2 = new Stack<>();

        stack1.push(p);
        stack2.push(q);

        while (!stack1.isEmpty() || !stack2.isEmpty() ) {
            TreeNode curr1 = stack1.pop();
            TreeNode curr2 = stack2.pop();
            if (!checkFalse(curr1,curr2)) return false;

           if (curr1.left != null && curr2.left != null) {
                stack1.push(curr1.left);
                stack2.push(curr2.left);
            }

            if  (curr1.right != null && curr2.right != null) {
                    stack2.push(curr2.right);
                    stack1.push(curr1.right);
            }



        }

            return true;

    }
    private boolean checkFalse (TreeNode p, TreeNode q){
        if (p.left == null && q.left != null) return false;
        if (p.left != null && q.left == null) return false;
        if (p.right == null && q.right != null) return false;
        if (p.right != null && q.right == null) return false;
      //  if (p.val != q.val) return false;
        return p.val == q.val;
    }

}
