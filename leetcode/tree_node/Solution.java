package leetcode.tree_node;

import java.util.ArrayList;
import java.util.List;

public class Solution {
   private List<Integer> answer = new ArrayList<>();
    protected List<Integer> preorderTraversal(TreeNode root) {

            dfs(root);
            return answer;
    }
        private void dfs (TreeNode node)
        {
            if (node == null) {
                return;
            }
            // Visit the root first, then the left subtree, then the right subtree.
            answer.add(node.val);
            dfs(node.left);
            dfs(node.right);
        }
}
