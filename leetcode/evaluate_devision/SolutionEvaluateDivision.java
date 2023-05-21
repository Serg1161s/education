package leetcode.evaluate_devision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SolutionEvaluateDivision {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        double[] answer = new double[queries.size()];

        HashMap<String,Double> map = new HashMap<>();
        int countValues = 0;
        for (List<String> listEquations:equations) {
            if (!map.containsKey(listEquations.get(0))) {
                map.put(listEquations.get(0), values[countValues]);
            }
            if (!map.containsKey(listEquations.get(1))) {
                map.put(listEquations.get(1), 1 / values[countValues++]);
            }
        }

        map.entrySet().forEach(entry ->
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        int countQueries = 0;
        for (List<String> listQueries:queries) {



         //   answer[countQueries] = findAnswer (queries, )
        }


        return answer;
    }

}
