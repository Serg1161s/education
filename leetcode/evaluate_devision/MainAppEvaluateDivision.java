package leetcode.evaluate_devision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAppEvaluateDivision {

    public static void main(String[] args) {


        List<String> equation1 = new ArrayList<>();
        equation1.add("a");
        equation1.add("b");
        List<String> equation2 = new ArrayList<>();
        equation2.add("e");
        equation2.add("f");
        List<String> equation3 = new ArrayList<>();
        equation3.add("b");
        equation3.add("e");

        List<List<String>> equations = new ArrayList<>();
        equations.add(equation1);
        equations.add(equation2);
        equations.add(equation3);
        double [] values = {1,1,1};


        List<String> query1 = new ArrayList<>();
        query1.add("b");
        query1.add("a");
        List<String> query2 = new ArrayList<>();
        query2.add("a");
        query2.add("f");
        List<String> query3 = new ArrayList<>();
        query3.add("f");
        query3.add("f");
        List<String> query4 = new ArrayList<>();
        query4.add("x");
        query4.add("e");
        List<String> query5 = new ArrayList<>();
        query5.add("f");
        query5.add("x");
        List<List<String>> queries = new ArrayList<>();
        queries.add(query1);
        queries.add(query2);
        queries.add(query3);
        queries.add(query4);
        queries.add(query5);
        for (List<String> list:equations) {
            System.out.print("{");
            for (String str: list ) {
                System.out.print(" " + str);
            }
            System.out.print("}");
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println(Arrays.toString(values));

        for (List<String> list:queries) {
            System.out.print("{");
            for (String str: list ) {
                System.out.print(" " + str);
            }
            System.out.print("}");
            System.out.print(" ");
        }
        System.out.println("");
        SolutionEvaluateDivision solutionEvaluateDivision = new SolutionEvaluateDivision();
        System.out.println(Arrays.toString(solutionEvaluateDivision.calcEquation(equations,values,queries)));
    }

}
