package leetcode.bin_search;

public class MainApp {
    public static void main(String[] args) {

        SolutionFindMedianSortedArrays s = new SolutionFindMedianSortedArrays();

        int [] num1 = {1,3,   4,   5, 5,5};
        int [] num2 = { 1,2,3,    4   ,5,6};

      System.out.println(s.findMedianSortedArrays(num1,num2));



    }
}
