package leetcode.algoritm.algoritmcontains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class Solutoin {
    public boolean containsNearbyDuplicate(int[] nums, int k) {



        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (hashMap.containsKey(integer) && i - hashMap.get(integer) <= k)
                return true;
            hashMap.put(integer, i);
        }
        return false;
    }
}
