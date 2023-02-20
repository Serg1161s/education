package leetcode.tree_node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {
    protected List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()){
            TreeNode currNode = stack.peek();  //looks at the element at the top of the stack without removing it
            stack.pop(); //removes the element at the top of the stack and returns it as the value of the function
            if (currNode != null){
                answer.add(currNode.val);
                stack.add(currNode.right);
                stack.add(currNode.left);
            }
        }
        return answer;
    }
}
