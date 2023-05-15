package leetcode.list_node.swap_nodes;

public class ListNodeForSwap {
    int val;
    ListNodeForSwap next;

    protected ListNodeForSwap() {
    }

    protected ListNodeForSwap(int val) {
        this.val = val;
    }

    protected ListNodeForSwap(int val, ListNodeForSwap next) {
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
