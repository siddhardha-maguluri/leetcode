package Arrays;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class AllNumbersDisappeared {
	
	/* I used a hashtable to store all the numbers given in nums.
	 * Since the given range is [1,n], a for loop with start index 1 till the length
	 * of the array(n). i am checking if the given number is in hashtable or not.
	 * if it is not there i am adding it to the list and finally i return the list.
	 * searching in hashtable is a constant time operation. So, the time complexity 
	 * of this solution is O(N). (looping through the array).
	 */
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> result = new ArrayList<>();
	        
	        Hashtable<Integer,Integer> ht = new Hashtable<>();
	        
	        for(int i=0; i < nums.length; i++) {
	        	ht.put(nums[i],i);
	        }
	        
	        for(int i=1; i < nums.length; i++) {
	        	if(!ht.containsKey(i)) {
	        		result.add(i);
	        	}
	        }
	    return result;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {4,3,2,7,8,2,3,1};
		AllNumbersDisappeared cd = new AllNumbersDisappeared();
		System.out.println(cd.findDisappearedNumbers(arr));

	}

}
