package leetcode.list_node.swap_nodes;

public class SolutionFromLeetCode {
    protected ListNodeForSwap swapNodes(ListNodeForSwap head, int k){

        ListNodeForSwap left = head;
        ListNodeForSwap right = head;

        for (int i = 1; i < k ; i++) {
            left = left.next;
        }

        ListNodeForSwap current = left;
        while (current.next != null){
            current = current.next;
            right = right.next;
        }

        int temp = left.val;;
        left.val = right.val;
        right.val = temp;

        return head;

    }
}
