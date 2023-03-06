package leetcode.algoritm.find_kth_positive;

public class MainApp {

    public static void main(String[] args) {
        int [] nums = {
                2,3,4,7,11
        };
        int [] nums2 = {
               1,2,3,4
        };
        int k = 5;
        int k2 = 2;

        SolutionFindKthPositive solutionFindKthPositive = new SolutionFindKthPositive();
        System.out.println(solutionFindKthPositive.findKthPositive(nums,k));
        System.out.println(solutionFindKthPositive.findKthPositive(nums2,k2));
    }

}
