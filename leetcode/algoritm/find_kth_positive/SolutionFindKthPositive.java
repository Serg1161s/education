package leetcode.algoritm.find_kth_positive;

public class SolutionFindKthPositive {
    protected int findKthPositive(int[] arr, int k) {
     int ans = 0;
     int i = 1;
     int j = 1;
       while (j-1 < arr.length && k != 0){
         if (arr[j-1] == i ){
             i++;
             j++;
             ans++;
         } else {
             k--;
             ans++;
             i++;

         }

       }
       if ( k!= 0) {
           ans +=  k;

       }

     return ans;
    }

}
