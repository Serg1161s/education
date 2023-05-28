package leetcode.evaluate_devision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAppEvaluateDivision {

    public static void main(String[] args) {


        List<String> equation1 = new ArrayList<>();
        equation1.add("x1");
        equation1.add("x2");
        List<String> equation2 = new ArrayList<>();
        equation2.add("x2");
        equation2.add("x3");
        List<String> equation3 = new ArrayList<>();
        equation3.add("x1");
        equation3.add("x4");
        List<String> equation4 = new ArrayList<>();
        equation4.add("x2");
        equation4.add("x5");


        List<List<String>> equations = new ArrayList<>();
        equations.add(equation1);
        equations.add(equation2);
        equations.add(equation3);
        equations.add(equation4);
        double [] values = {3,4,5,6};


        List<String> query1 = new ArrayList<>();
        query1.add("x5");
        query1.add("x2");
        List<String> query2 = new ArrayList<>();
        query2.add("x4");
        query2.add("x3");
        List<String> query3 = new ArrayList<>();
        query3.add("bc");
        query3.add("cd");
        List<String> query4 = new ArrayList<>();
        query4.add("cd");
        query4.add("bc");
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
        System.out.println("");
//        SolutionEvaluateDivision solutionEvaluateDivision = new SolutionEvaluateDivision();
//        System.out.println(Arrays.toString(solutionEvaluateDivision.calcEquation(equations,values,queries)));

        SolutionEaDev2 solutionEaDev2 = new SolutionEaDev2();
        System.out.println(Arrays.toString(solutionEaDev2.calcEquation(equations,values,queries)));
    }

}
