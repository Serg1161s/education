package leetcode.arrays.marge_sorted_arrays.pages.functions;

import leetcode.arrays.marge_sorted_arrays.pages.arrays.ArrayFirst;

import java.util.Arrays;

public class GenerateArrayRandom {

    public static String [] generateArrayRandom(int lengthOfArray, int rangeOfNum){
        String [] ans = new String[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {

            ans[i] = String.valueOf ((int)  (Math.random()*rangeOfNum));
        }
        return ans;
    }
}
