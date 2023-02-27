package leetcode.algoritm.algoritmcontains_duplicate;

public class MainApp
{
    public static void main(String[] args) {
        int [] array = {99,99};
        int k = 2;

        Solutoin s = new Solutoin();
        System.out.println(s.containsNearbyDuplicate(array,k));

    }
}
