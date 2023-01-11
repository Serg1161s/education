package leetcode.multiply.strings;

import java.util.ArrayList;

public class SolutionMS {
    public String multiply(String num1, String num2) {

        String first = "";
        String second = "";
        String sum = "";
       if (num1.length() < num2.length()) {
            first = num2;
            second = num1;
       } else {
            first = num1;
            second = num2;
       }
       int countSecond=1;
        for (int i = second.length()-1; i >= 0; i--) {
            int countFirst = 1*countSecond;
            for (int j = first.length()-1; j >=0 ; j--) {

                sum = sumStr (sum,countFirst, second.charAt(i),first.charAt(j));
                countFirst=countFirst*10;
            }
            countSecond = countSecond*10;

        }

        return String.valueOf(sum);
    }
    private static String sumStr (String sum, int countFirst, char second, char first){



        return sum;
    }
}
