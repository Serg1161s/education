package leetcode.algoritm.can_make_arithmetic_progression;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int [] arr =  {1,4,3};

        System.out.println(canMakeArithmeticProgression(arr));

    }
    private static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int prog = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] != prog) return false;
        }
        return true;
    }
}
