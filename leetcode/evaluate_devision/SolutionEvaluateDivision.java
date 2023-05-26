package leetcode.evaluate_devision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SolutionEvaluateDivision {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] answer = new double[queries.size()];
        int count = 0;
        for (List<String> query: queries){
            double sum = foundAnswer (query.get(0),query,values,equations);
            answer[count++] = sum;
        }



        return answer;
    }
    private static double foundAnswer (String strFirst, List<String> query, double [] values,List<List<String>> equations){
int count = 0;
double ans = 1;
        for (List<String> equation : equations) {
            if (query.get(0).equals(equation.get(0)) && query.get(1).equals(query.get(0))) {
                return 1;
            }
            if (query.get(1).equals(equation.get(1)) && query.get(1).equals(query.get(0))) {
                return 1;
            }
            if (query.get(1).equals(equation.get(0)) && query.get(0).equals(equation.get(1))){
                return  1/values[count];
            }
            if (strFirst.equals(equation.get(0))) {

                 ans = firstStep(query.get(0), query, values, equations, 1);
                if (ans > 0) {
                    return ans;
                }
            }
                ans = secondStep(query.get(0), query, values, equations, ans);
                    if (ans > 0) {
                        return ans;


            }
            count++;
        }

        return -1;
    }
    private static double firstStep (String strFirst, List<String> query, double [] values,List<List<String>> equations, double ans){
        int count = 0;
        for (List<String> equation : equations){
            if (strFirst.equals(equation.get(0))){
                ans*=values[count];
                if (query.get(1).equals((equation.get(1)))){
                    return ans;
                }
                return firstStep(equation.get(1),query,values,equations,ans);

            } else
            if (strFirst.equals(equation.get(1)) &&  (query.get(1).equals((equation.get(0))))){
                    return ans/values[count];
                }

            count++;
        }
        return -1 * ans;
    }
    private static double secondStep (String strFirst, List<String> query, double [] values,List<List<String>> equations, double ans){
        int count = 0;
        for (List<String> equation : equations){
            if (strFirst.equals(equation.get(1))){
                ans/=values[count];
                if (query.get(1).equals((equation.get(0)))){
                    return -1*ans;
                }
                return secondStep (equation.get(0),query,values,equations,ans);

            } else if (strFirst.equals(equation.get(0)) &&  (query.get(1).equals((equation.get(1))))){
                return ans*values[count];
            }
            count++;
        }
        return -1;
    }

}
