package leetcode.list_node.pair_sum;

import leetcode.list_node.add_two_numbers.ListNode;
import leetcode.list_node.add_two_numbers.Solution2;
import leetcode.list_node.swap_nodes.ListNodeForSwap;

public class ManAppForPairSum {

    public static void main(String[] args) {

        ListNodeForPairSum l1 = new ListNodeForPairSum();
        ListNodeForPairSum l2 = new ListNodeForPairSum(100,
                new ListNodeForPairSum(300,
                        new ListNodeForPairSum(4,
                                new ListNodeForPairSum(2,
                                        new ListNodeForPairSum(90,
                                        new ListNodeForPairSum( 30))
                                )))
        );
        System.out.println(l1.toString());


        SolutionFromLeetCodePairSum s = new SolutionFromLeetCodePairSum();
        System.out.println(s.pairSum(l2));




    }

}
