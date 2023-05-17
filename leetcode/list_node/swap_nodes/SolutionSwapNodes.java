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

        int back = size-temp+1;
    if (back < size){
        int change = back;
        back =k;
        k=change;

    }

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
        if (back==size)break;
        ansswer = ansswer.next;

    }
    ansswer = head;
    size = 0;
    while (size<=k){
        size++;
        if (size == k){
            ansswer.val = tempSecond;
            break;
        }

        ansswer = ansswer.next;
    }


    return head;
    }

}
