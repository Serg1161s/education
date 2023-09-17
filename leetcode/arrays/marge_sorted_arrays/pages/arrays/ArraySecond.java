package leetcode.arrays.marge_sorted_arrays.pages.arrays;

import java.util.Arrays;

public class ArraySecond {
    private String [] arraySecond;

    public String[] getArraySecond() {
        return arraySecond;
    }

    public void setArraySecond(String[] arraySecond) {
        this.arraySecond = arraySecond;
    }

    @Override
    public String toString() {
        return "ArraySecond{" +
                "arrayFirst=" + Arrays.toString(arraySecond) +
                '}';
    }
}
