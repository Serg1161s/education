package leetcode.Sstring.longest_without_repiting;

public class MainApp {


    public static void main(String[] args) {
        String str = "123345678123";
        Solution s = new Solution();

        System.out.println(s.lengthOfLongestSubstring(str));
        Solution3 s3 = new Solution3();

        System.out.println(s.lengthOfLongestSubstring(str));

    }
}
