package leetcode.evaluate_devision;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionEaDev2 {
        protected double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            UnionFind uf = new UnionFind();
            for (int i = 0; i < values.length; i++) {
                List<String> equation = equations.get(i);
                double value = values[i];
                uf.union(equation.get(0), equation.get(1), value);
            }

            double[] result = new double[queries.size()];
            for (int i = 0; i < queries.size(); i++) {
                List<String> query = queries.get(i);
                String firstNumber = query.get(0);
                String secondNumber = query.get(1);

                Operation firstHead = uf.find(firstNumber);
                Operation secondHead = uf.find(secondNumber);
                if (firstHead != null && secondHead != null && firstHead.number.equals(secondHead.number)) {
                    result[i] = secondHead.value / firstHead.value;
                } else {
                    result[i] = -1;
                }
            }

            return result;
        }
    }

     class UnionFind {
        Map<String, Operation> group;

        public UnionFind() {
            this.group = new HashMap<>();
        }

        protected void union(String firstNumber, String secondNumber, double cost) {
            group.putIfAbsent(firstNumber, new Operation(firstNumber, 1.0));
            if (group.get(secondNumber) == null)
                group.put(secondNumber, new Operation(firstNumber, cost));
            else {
                // b * cost = a
                // b * secondHead.value = secondHead.number
                // a * firstHead.value  = firstHead.number
                // secondHead.number / secondHead.value * cost ()
                Operation secondHead = find(secondNumber);
                Operation firstHead = find(firstNumber);
                group.put(secondHead.number, new Operation(firstHead.number, cost * firstHead.value / secondHead.value));
            }
        }

        protected Operation find(String number) {
            if (group.get(number) == null) return null;
            double cost = 1.0;
            String current = number;

            while (!group.get(current).number.equals(current)) {
                Operation next = group.get(current);
                cost = cost * next.value;
                current = next.number;
            }

            Operation newHead = new Operation(current, cost);
            group.put(number, newHead);
            return group.get(number);
        }
    }


    class Operation {
        String number;
        double value;

        public Operation(String number, double value) {
            this.number = number;
            this.value = value;
        }
    }

