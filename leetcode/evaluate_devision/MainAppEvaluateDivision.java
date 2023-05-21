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
        equation2.add("b");
        equation2.add("c");
        List<List<String>> equations = new ArrayList<>();
        equations.add(equation1);
        equations.add(equation2);
        double [] values = {2.0, 3.0};


        List<String> query1 = new ArrayList<>();
        query1.add("a");
        query1.add("c");
        List<String> query2 = new ArrayList<>();
        query2.add("b");
        query2.add("a");
        List<String> query3 = new ArrayList<>();
        query3.add("e");
        query3.add("a");
        List<String> query4 = new ArrayList<>();
        query4.add("a");
        query4.add("e");
        List<String> query5 = new ArrayList<>();
        query5.add("x");
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
        SolutionEvaluateDivision solutionEvaluateDivision = new SolutionEvaluateDivision();
        solutionEvaluateDivision.calcEquation(equations,values,queries);
    }

}
