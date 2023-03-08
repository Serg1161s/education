package leetcode.algoritm.bananas;

public class SolutionEating {
    private boolean checkPiles (int [] pil, int med, int hours){
        int i = 0;

        int count = 0;
        while (i < pil.length){
            while (pil[i] > 0){
                pil[i] -= med;
                count++;
            }
            i++;
        }

        return hours < count;
    }
    public int minEatingSpeed(int[] piles, int h) {

        int min = piles[0];
        int max = piles [0];

        for (int p : piles){
            max = Math.max(max,p);
            min = Math.min(min,p);
        }


        while (min <= max ){
            int med = min + (max - min)/2;

            if (checkPiles (piles,med,h)) {
                max = med;
            } else {
                min = med + 1;
            }
        }

        return min;
    }

}
