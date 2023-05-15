package leetcode.list_node.swap_nodes;

public class SolutionSwapNodes {

    protected ListNodeForSwap swapNodes(ListNodeForSwap head, int k) {

        ListNodeForSwap count = head;
        int size = 0;
        int temp = 0;
    while (count != null){
        size++;
        if (k == size) {
            temp = size;
        }
        count = count.next;
    }
        int back = size-temp;

    size = 0;
    ListNodeForSwap ansswer = head;
    int tempFirst = 0;
    int tempSecond = 0;

    while (size<=back){
        size++;
        if (size == k) {
            tempFirst = ansswer.val;
        }
        if (size == back) {
            tempSecond = ansswer.val;
            ansswer.val = tempFirst;
        }
        ansswer = ansswer.next;

    }
    ansswer = head;
    size = 0;
    while (size<=k){
        size++;
        if (size == k){
            ansswer.val = tempSecond;
            return head;
        }

        ansswer = ansswer.next;
    }

    while (head != null){
        System.out.println(head.val);
        head = head.next;
    }

        System.out.println(size);
        System.out.println(temp);
        System.out.println(back);

    return count;
    }

}
