package leetcode.list_node.add_two_numbers;

public class Solution {

    private ListNode ans;
    private ListNode res;
    private int add = 0;
    protected ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        while (l1 != null) {
            int num1 = l1.val;
            int num2 = l2.val;
            int sum = num1 + num2 + add;
            ans = new ListNode( sum % 10,ans);
            add = sum/10;
            l1 = l1.next;
            l2 = l2.next;
            if (l2 == null){
                while (l1 != null) {
                    num1 = l1.val;
                    sum = num1 + add;
                    ans = new ListNode( sum % 10,ans);
                    add = sum/10;
                    l1 = l1.next;
                }

            }

        }
        while (l2 != null) {
           int num2 = l2.val;
           int sum = num2 + add;
            ans = new ListNode( sum % 10,ans);
            add = sum/10;
            l2 = l2.next;
        }
        if (add == 1) {
            ans = new ListNode(1,ans);
        }
        while (ans != null) {
            res = new ListNode(ans.val,res);
            ans = ans.next;
        }


        return res;
    }
}
