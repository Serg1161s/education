package leetcode.list_node.add_two_numbers;

public class ManApp {

    public static void main(String[] args) {

        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode(9, new ListNode(9));

        System.out.println(l1.toString());


        Solution2 s = new Solution2();
        l1 = s.addTwoNumbers(l1,l2);




    }

}
