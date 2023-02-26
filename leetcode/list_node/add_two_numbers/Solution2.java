package leetcode.list_node.add_two_numbers;

import java.util.Arrays;

public class Solution2 {
    protected ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int num1 = l1.val;
        int num2 = l2.val;
        int add = 0;
        int sum = num2 + num1;

        if ( sum > 10) {
            sum = sum - 10;
            add = 1;
         }

        l1.val = sum;
        if (l1.next == null && add == 1) {
            l1.next = new ListNode(add);
        } else if (add == 1) {
            l1.next.val++;

        }
        if (l1.next != null && l2.next != null){
            addTwoNumbers(l1.next,l2.next);
        } else if (l1.next == null && l2.next != null ) {
            addTwoNumbers(new ListNode(0),l2.next);
        }
        else if (l1.next != null && l2.next == null) {
            addTwoNumbers(l1.next,new ListNode(0));

        }

        System.out.println(Arrays.asList(l1));

        return l1;
    }

}
