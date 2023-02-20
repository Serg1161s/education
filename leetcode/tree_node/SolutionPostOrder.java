package leetcode.tree_node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SolutionPostOrder {
    protected List<Integer> postorderTraversal(TreeNode root) {

        List <Integer> answer = new ArrayList<>();
        Stack <TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            TreeNode curr = stack.pop();
            answer.add(0,curr.val);

            if (curr.left != null){
                stack.push(curr.left);
            }
            if (curr.right != null){
                stack.push(curr.right);
            }
        }




        return answer;
    }


}
