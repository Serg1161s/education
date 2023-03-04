package leetcode.tree_node;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

    protected List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> ans = new ArrayList<>();
        tree (root, ans);
        return ans;
    }
    private void tree (TreeNode root,List ans){
        if (root == null) return;

        tree(root.left,ans);
        ans.add(root.val);
        tree(root.right,ans);
    }
}
