package leetcode.list_node.swap_nodes;

public class ManAppForSwapNodes {

    public static void main(String[] args) {

        ListNodeForSwap l1 = new ListNodeForSwap();
        ListNodeForSwap l2 = new ListNodeForSwap(9,
                new ListNodeForSwap(3,
                new ListNodeForSwap(4,
                new ListNodeForSwap(2,
                new ListNodeForSwap(2)))));

        System.out.println(l1.toString());


        SolutionSwapNodes s = new SolutionSwapNodes();
        l1 = s.swapNodes(l2,2);

    }

}
