package leetcode.multiply.strings;

import java.math.BigInteger;

public class MainAppMS {
    public static void main(String[] args) {
        String num1 = "0";
        String  num2 = "1234567768000000000089";
        int num3 = 123456789;
        int  num4 = 98765431;
        SolutionMS sol = new SolutionMS();
        System.out.println(sol.multiply(num1,num2));
        long s= num3*num4;
        System.out.println(s);

    }
}
