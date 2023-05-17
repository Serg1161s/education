package leetcode.list_node.pair_sum;

public class SolutionPairSum {

    protected int pairSum(ListNodeForPairSum head) {
        int answer = 0;

        ListNodeForPairSum count = head;
        int size = 0;
        while (count != null){
            size++;
            count =count.next;
        }

        if (size <= 1 ) return head.val;

        int [] array = new int [size/2];

        count = head;

        for (int i = 0; i < size/2; i++) {
            array [i] = count.val;
            count = count.next;

        }
        for (int i = size/2-1 ; i >=0 ; i--) {
            answer = Math.max(answer, (array[i] + count.val));
            count = count.next;

        }



        return answer;
    }
}
