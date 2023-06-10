package leetcode.string.longest_without_repiting.str;

import java.util.Arrays;
/*
Solved by me)
   Given two strings needle and haystack,
 return the index of the first occurrence of needle in haystack,
 or -1 if needle is not part of haystack.
 */
public class MainApp  {
    public static void main(String[] args) {

        String str1 = "dccccdcdc";
        String str2 = "dcdcdc";
        System.out.println(strStr(str1,str2));

    }
    public static int strStr(String haystack, String needle) {

        int needleLength = needle.length();


        for (int i = 0; i <= haystack.length() - needleLength; i++) {
            if (checkStr(haystack.substring(i,i+needleLength),needle)) return i;
        }

        return -1;
    }
    private static boolean checkStr(String str, String needle){
        return str.equals(needle);
    }

}
