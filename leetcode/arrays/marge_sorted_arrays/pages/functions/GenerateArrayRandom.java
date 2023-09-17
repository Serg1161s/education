package leetcode.arrays.marge_sorted_arrays.pages.functions;

public class GenerateArrayRandom {
    public int [] generateArrayRandom(int lengthOfArray, int rangeOfArray){
        int[] ans = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            ans[i] = (int) (  Math.random()*rangeOfArray);

        }
    return ans;
    }
}
