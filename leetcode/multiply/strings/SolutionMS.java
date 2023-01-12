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
            sum = sumStr ( first , second);
        return sum;
    }
    private static String sumStr (String firstN, String secondN){
        ArrayList <Integer> sumIn = new ArrayList<>();
        int countMain;
        for (int i = secondN.length()-1; i >=0; i--) {
            countMain =secondN.length()- 1 - i;
            for (int j = firstN.length()-1; j >=0 ; j--) {
                int a = secondN.charAt(i)-'0';
                int b = firstN.charAt(j)-'0';
                int sum = a*b;
                sumIn = resultSum (sumIn, sum, countMain);
                countMain++;
            }

        }
        String res = "";
        int countZero=0;
        for (int i = sumIn.size()-1; i >=0 ; i--) {
            res =res +sumIn.get(i);
            if (sumIn.get(i) == 0) {
                countZero++;
            }
        }
        if (countZero == sumIn.size()) {
            res = "0";
        }
   //     System.out.println(res);
        return res;
    }
    private static ArrayList<Integer> resultSum (ArrayList<Integer> sumIn, int sum, int countMain){
        if (sumIn.size()-1 < countMain ) {
            sumIn.add(sum%10);
        } else{
            sumIn.set(countMain, sumIn.get(countMain) + sum % 10);
        }
        int count = countMain;
        while (sumIn.get(count)>9){
            sumIn.set(count,sumIn.get(count)%10);
            if (++count == sumIn.size()){
                sumIn.add(1);
            } else {
                sumIn.set(count, sumIn.get(count) + 1);
            }
        }
        int countSec = countMain+1;
        if (sum/10 > 0 ) {
            if (sumIn.size()-1 < countSec) {
                sumIn.add(sum / 10);
            }else {
                sumIn.set(countSec, sumIn.get(countSec) + sum / 10);
            }
            while (sumIn.get(countSec) > 9) {
                sumIn.set(countSec, sumIn.get(countSec) % 10);
                if (++countSec == sumIn.size()) {
                    sumIn.add(1);
                } else {
                    sumIn.set(countSec, sumIn.get(countSec) + 1);

                }
            }
        }
        
        return sumIn;
    }

}
