package DynamicProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PartitionStringIntoMinimumBeautifulSubstrings {

    public static boolean isBeautiful(String s){
        return s.charAt(0) != '0' && isPowerOf5(Integer.parseInt(s,2));
    }
    public static boolean isPowerOf5(int num){
        while(num > 1){
            if(num%5 !=0){
                return false;
            }
            num = num /5;
        }
        return true;
    }
    private static int partitionRecursive(String s){
        if(s.length() == 0){
            return 0;
        }
        int ans = 20;
        for(int i=0; i < s.length(); i++){
            String currSubstring = s.substring(0,i+1);
            if(isBeautiful(currSubstring)){
                ans = Math.min(ans, 1+partitionRecursive(s.substring(i+1)));
            }
        }
        return ans;
    }

    public static int minimumBeautifulSubstrings(String s){
        int ans = partitionRecursive(s);
        return ans == 20?-1:ans;
    }

    public static void main(String[] args) {
        System.out.println(minimumBeautifulSubstrings("101"));
    }
}
