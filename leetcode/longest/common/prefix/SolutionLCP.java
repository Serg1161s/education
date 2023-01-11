package leetcode.longest.common.prefix;

public class SolutionLCP {
    public String longestCommonPrefix(String[] strs) {
       String ans = "";
        if (strs.length <1) {
            return ans;
        }

        ans = strs[0];
        for (int i = 0; i < strs.length; i++) {
          ans = checkAns (ans, strs[i]);

        }
       return ans;
    }
    private static String checkAns (String ans, String str){
        String prefix = "";
        String comp = "";
        if (str.length() < ans.length()){
            prefix = str;
            comp = ans;
        } else {
            prefix = ans;
            comp = str;
        }
        for (int i = 0; i < prefix.length() ; i++) {
            if (prefix.charAt(i) != comp.charAt(i)) {
                return prefix.substring(0,i);
            }
        }
        return prefix;
    }
}
