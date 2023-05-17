package leetcode.list_node.swap_nodes;

public class ManAppForSwapNodes {

    public static void main(String[] args) {

        ListNodeForSwap l1 = new ListNodeForSwap();
        ListNodeForSwap l2 = new ListNodeForSwap(100,
               new ListNodeForSwap(3,
               new ListNodeForSwap(4,
               new ListNodeForSwap(2,
               new ListNodeForSwap(90)
               )))
        );


        System.out.println(l2.toString());

        SolutionFromLeetCode s = new SolutionFromLeetCode();
        l1 = s.swapNodes(l2,2);
        System.out.println(l1.toString());
    }

}
