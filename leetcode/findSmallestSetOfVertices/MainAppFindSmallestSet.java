package leetcode.findSmallestSetOfVertices;

import java.util.ArrayList;
import java.util.List;

public class MainAppFindSmallestSet {
    public static void main(String[] args)
     {
        List<List<Integer>> listNode = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
         List<Integer> list2 = new ArrayList<>();
         List<Integer> list3 = new ArrayList<>();
         List<Integer> list4 = new ArrayList<>();
         List<Integer> list5 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        listNode.add(list1);
        list2.add(2);
        list2.add(1);
         listNode.add(list2);
         list3.add(3);
         list3.add(1);
         listNode.add(list3);

         list4.add(1);
         list4.add(4);
         listNode.add(list4);

         list5.add(2);
         list5.add(4);
         listNode.add(list5);

         for (List<Integer> list:listNode) {
             System.out.print("{");
             for (Integer num: list) {
                 System.out.print(num + " ");

             }
             System.out.print("} ");
         }
         System.out.println("");
         System.out.println( findSmallestSetOfVertices(5,listNode));

     }

    private static List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res=new ArrayList<>();
        int[] visited=new int[n];
        for (List<Integer> e: edges)
            visited[e.get(1)] = 2;
        for(int i=0;i<n;i++){
            if(visited[i]==0) res.add(i);
        }
        return res;
    }
}
