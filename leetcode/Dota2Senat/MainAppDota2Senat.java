package leetcode.Dota2Senat;

public class MainAppDota2Senat {
    public static void main(String[] args) {

        String str = "DDDDRRDDDRDRDRRDDRDDDRDRRRRDRRRRRDRDDRDDRRDDRRRDDRRRDDDDRRRRRRRDDRRRDDRDDDRRRDRDDRDDDRRDRRDRRRDRDRDR";
String str1 = "DRR";
String str2 = "RDD";
        System.out.println(str);

        SolutionDota2Senat solutionDota2Senat = new SolutionDota2Senat();
        System.out.println(solutionDota2Senat.predictPartyVictory(str));
        System.out.println(str1);
        System.out.println(solutionDota2Senat.predictPartyVictory(str1));
        System.out.println(str2);
        System.out.println(solutionDota2Senat.predictPartyVictory(str2));

    }
}
