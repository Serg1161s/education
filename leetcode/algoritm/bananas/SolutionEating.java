package leetcode.algoritm.bananas;

public class SolutionEating {
    private boolean checkPiles (int [] pil, int med, int h){
        int i = 0;

        while (i < pil.length){
            int num = pil[i];
            h -= (int )Math.ceil((double) num/med);
            i++;
            if (h < 0) return false;
        }

        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {

//        int max = piles [0];
//        int min = piles [0];

       long sum = 0;

        for (int p : piles){
//            max = Math.max(max,p);
//            min = Math.min(min,p);
            sum+=p;

        }
        //int  min = (min*piles.length)/h ;
        int n = piles.length;
        int min =(int) (sum/h + (sum%h == 0? 0:1));
        int max = (int)(sum / (h - n + 1)) + 1;


        while (min < max ){
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
