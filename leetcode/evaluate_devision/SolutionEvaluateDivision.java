package leetcode.evaluate_devision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SolutionEvaluateDivision {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] answer = new double[queries.size()];

        HashMap <String, Double> map = new HashMap<>();
        int countEq = 0;
        for (List<String> list: equations) {
            if (!map.containsKey(list.get(0))){
                if (values[countEq] == 1) {
                    map.put(list.get(0), -1.0);
                } else {
                    map.put(list.get(0), findNum(list.get(1), equations, values, values[countEq]));
                }
            }
            countEq++;
        }
        countEq = 0;
        for (List<String> list: equations) {
            if (!map.containsKey(list.get(1))){
                if (values[countEq] == 1) {
                map.put(list.get(1),-1.0);
            } else {
                    map.put(list.get(1),1.0);
                }
            countEq++;
        }
        }
    map.entrySet().forEach(entry -> {
        System.out.println(entry.getKey()+ ", "+ entry.getValue());
    });
        int countQueries = 0;
        for (List<String> list: queries){
            if (!map.containsKey(list.get(0)) || (!map.containsKey(list.get(1))) ) {
                    answer[countQueries] = -1;
            } else if (map.get(list.get(0)) < 0 || (map.get(list.get(1))) <0){
                if (list.get(0).equals(list.get(1))){
                    answer[countQueries] = 1;
                } else {
                    answer[countQueries] = -1;
                }
            }

             else if (map.containsKey(list.get(0)) || (map.containsKey(list.get(1)))){
                answer[countQueries] = map.get(list.get(0)) / map.get(list.get(1));
            }
            countQueries++;
        }

        return answer;
    }
   private static double  findNum(String str, List<List<String>> equations, double [] values,double answer){


        int countEquation = 0;

        for (List<String> equation: equations) {
            if (str.equals (equation.get(0))) {
                answer *= values[countEquation];
                str = equation.get(1);
                return findNum(str, equations, values, answer);
            }
            countEquation++;
        }
        return answer;
    }
    private static double  findNum2(String str, List<List<String>> equations, double [] values,double answer){
        int countEquation = 0;
        for (List<String> equation: equations) {
            if (str.equals (equation.get(1))) {
                answer *= values[countEquation];
                str = equation.get(0);
                return findNum2(str, equations, values, answer);
            }
            countEquation++;
        }
        return answer;
    }
}
