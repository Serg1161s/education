package leetcode.longest.common.prefix;

public class NewAppLCP {
    public static void main(String[] args) {
        String[] strs = { "flower","flow","flight"};

        SolutionLCP solv = new SolutionLCP();

        System.out.println(solv.longestCommonPrefix(strs));


    }
}
