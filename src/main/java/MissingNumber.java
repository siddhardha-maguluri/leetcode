import java.util.Arrays;

public class MissingNumber {
	
	public int missingNumber(int[] nums) {
		
		/* The initial approach i followed is, sort the array and compare 
		 * the consecutive elements and check for the difference. if difference 
		 * is not equal 1, then it means both the numbers are not consecutive.
		 * so, i am returing the current element + 1, which is the missing number.
		 * 
		 * The time complexity for this approach is O(nlogn), because
		 * i am sorting the array first and then iterating the whole array(which is O(n)).
		 * since the dominating term in O(nlogn). the final time complexity is O(nlogn). 
		 */
		
        int missingNumber = 0;
        Arrays.sort(nums);
        if(nums[nums.length -1] != nums.length){
            missingNumber = nums.length;
        }
        else{
            for(int i=0; i < nums.length-1; i++){
                if(nums[i+1] - nums[i] != 1){
                    missingNumber = nums[i]+1;
                }
            }
        }    
        return missingNumber;
    }

	public static void main(String[] args) {
		int[] nums = new int[] {9,6,4,2,3,5,7,0,1};
		MissingNumber mn = new MissingNumber();
		System.out.println(mn.missingNumber(nums));
	}

}
