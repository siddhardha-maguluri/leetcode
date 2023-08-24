package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	
	/*
	 * Followed two pointer pattern. 
	 * 
	 * Time complexity - O(N^2)
	 */
	
	public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        
        List<List<Integer>> triplets = new ArrayList<>();

        for(int i=0; i<= nums.length-2; i++){

            //skipping duplicate numbers so that we will not have duplicate triplets.
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int num1 = nums[i];
            int start = i+1;
            int end = nums.length - 1;

            while(start < end){

                if (start > i + 1 && nums[start] == nums[start - 1]) {
                    start++;
                    continue;
                }
                if (end < nums.length - 1 && nums[end] == nums[end + 1]) {
                    end--;
                    continue;
                }

                int num2 = nums[start];
                int num3 = nums[end];

                int sum = num1 + num2 + num3;

                if( sum == 0 ){
                    triplets.add(Arrays.asList(num1, num2,num3));
                    start++;
                    end--;
                }
                else if( sum >0 ){
                    end--;
                } 
                else{
                    start++;
                }
            }
        }
        return triplets;
    }

	public static void main(String[] args) {
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		ThreeSum ts = new ThreeSum();
		System.out.println(ts.threeSum(nums));
		
	}

}
