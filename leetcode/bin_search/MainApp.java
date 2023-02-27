package leetcode.bin_search;

public class MainApp {
    public static void main(String[] args) {

        SolutionFindMedianSortedArrays s = new SolutionFindMedianSortedArrays();

        int [] num1 = {1,2,3,4,5,7};
        int [] num2 = {2,3,4,6,7,8};

        System.out.println(s.findMedianSortedArrays(num1,num2));

    }
}
