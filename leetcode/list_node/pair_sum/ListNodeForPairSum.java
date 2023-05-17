package leetcode.list_node.pair_sum;

public class ListNodeForPairSum {
    int val;
    ListNodeForPairSum next;

    protected ListNodeForPairSum() {
    }

    protected ListNodeForPairSum(int val) {
        this.val = val;
    }

    protected ListNodeForPairSum(int val, ListNodeForPairSum next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
