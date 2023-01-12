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
        for (int i = firstN.length()-1; i >=0 ; i--) {
            sumIn.add(firstN.charAt(i)-'0');
        }

        for (int i = secondN.length()-1; i >=0; i--) {
            for (int j = 0; j <sumIn.size() ; j--) {
                int a = secondN.charAt(i)-'0';
                int b = sumIn.get(j);
                int sum = a*b;
                sumIn = resultSum (sumIn, sum, j);
            }
        }

        String res = "";
        return res;
    }
    private static ArrayList<Integer> resultSum (ArrayList<Integer> sumIn, int sum, int i){
        sumIn.set(i,sumIn.get(i)+sum%10);
        int count = i;
        while (sumIn.get(count)>9){
            sumIn.set(count,sumIn.get(count)%10);
            sumIn.set(++count,sumIn.get(count)+1);
        }

        int countSec = i;
        while (sumIn.get(countSec)>9){
            sumIn.set(countSec,sumIn.get(countSec)%10);
            sumIn.set(++countSec,sumIn.get(countSec)+1);
        }
        
        return sumIn;
    }
}
