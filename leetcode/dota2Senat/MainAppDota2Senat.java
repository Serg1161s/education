package leetcode.dota2Senat;

public class MainAppDota2Senat {
    public static void main(String[] args) {

       // String str = "DDDDRRDDDRDRDRRDDRDDDRDRRRRDRRRRRDRDDRDDRRDDRRRDDRRRDDDDRRRRRRRDDRRRDDRDDDRRRDRDDRDDDRRDRRDRRRDRDRDR";
String str1 = "DDDDRRRR";
String str2 = "RDD";
       // System.out.println(str);

        SolutionDota2Senat2 solutionDota2Senat = new SolutionDota2Senat2();
     //   System.out.println(solutionDota2Senat.predictPartyVictory(str));
        System.out.println(str1);
        System.out.println(solutionDota2Senat.predictPartyVictory(str1));
        System.out.println(str2);
        System.out.println(solutionDota2Senat.predictPartyVictory(str2));

    }
}
