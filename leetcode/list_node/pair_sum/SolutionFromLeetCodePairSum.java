package leetcode.list_node.pair_sum;

public class SolutionFromLeetCodePairSum {
    protected int pairSum(ListNodeForPairSum head) {
        int ans = Integer.MIN_VALUE;

        ListNodeForPairSum slow = head;
        ListNodeForPairSum fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNodeForPairSum revers = null;

        while ( slow !=  null){
            revers = new ListNodeForPairSum(slow.val,revers);
            slow = slow.next;
        }

        while (revers != null){
            ans = Math.max(ans, (revers.val + head.val));
            revers = revers.next;
            head = head.next;
        }




        return ans;
    }

}
