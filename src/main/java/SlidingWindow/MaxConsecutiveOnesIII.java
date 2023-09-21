package SlidingWindow;

import java.util.PriorityQueue;

public class MaxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {
        int left=0, right;
        int max=0;
        int zeros=0;

        for(right=0; right < nums.length; right++){
            if(nums[right]==0){
                zeros++;
            }
            while(left <= right && zeros > k){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }

    public static int longestOnesOptimized(int[] nums, int k) {
        int left=0, right;
        for(right=0; right < nums.length;right++) {
            if (nums[right] == 0) {
                k--;
            }
            if(k < 0){
                k += 1 - nums[left];
                left++;
            }
        }
        return right-left;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums,2));
    }
}
