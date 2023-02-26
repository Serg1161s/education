package leetcode.Sstring.longest_without_repiting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    protected int lengthOfLongestSubstring(String s) {

    int ans = 0;
    int curr = 0;
    int position = 0;
        HashSet <Character> map = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.contains(s.charAt(i))){
                ans = Math.max(ans,i-position);

                while (s.charAt(position) != s.charAt(i)) {
                    map.remove(s.charAt(position));
                    position ++;
                }

                map.remove(s.charAt(position));
                i =  position;
            } else {
                map.add(s.charAt(i));

            }

        }

    return ans;
    }

}
