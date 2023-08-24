package Arrays;

import java.util.Hashtable;

public class ContainsDuplicate {
	
	 public boolean containsDuplicate(int[] nums) {
		 Hashtable<Integer, Integer> ht = new Hashtable();
		 
		 /* loop through the array and check if the current number is
		  * already there in the hashtable or not. if it is there, get the value
		  * associated with it(which is the count of the number`) and increment
		  * the value by one. if it is not there, just add the number as key and 1
		  * as value.
		 */
		 for(int i=0; i<nums.length; i++){
			 if(ht.get(nums[i]) != null){
				 ht.put(nums[i], ht.get(nums[i])+1);
	         }
	         else{
	            ht.put(nums[i],1);
	         }
	      }
		 
		  /* now we again loop through the hashtable, and get the value 
		   * associated with the key, if the value is equal or more than 2,
		   * it means we have a duplicate. so, we will return true.
		   */
	      for(int i=0;i<ht.size(); i++){
	    	  if(ht.get(nums[i])>=2)
	    		  return true;
	      }
	    return false;
	}

	public static void main(String[] args) {
		int arr[] = new int[] {1,3,2,1};
		ContainsDuplicate cd = new ContainsDuplicate();
		System.out.println(cd.containsDuplicate(arr));

	}

}
