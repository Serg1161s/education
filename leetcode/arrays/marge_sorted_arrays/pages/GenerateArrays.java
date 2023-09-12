package leetcode.arrays.marge_sorted_arrays.pages;

public class GenerateArrays {
    private String GenerateArrays(int lengthOfArray, int rangeOfNums){
        String ans = "";
        for (int i = 0; i < lengthOfArray; i++) {
            int num = (int) (Math.random()*10*rangeOfNums);
            ans = ans + " " + num;
        }
        return ans;
    }
}
