import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	/* used hashtable approach.
	 * We can use two pointer approach only when the array is in sorted order.
	 * 
	 * Time Complexity - O(N)
	 */
	
	public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> ht = new HashMap<Integer,Integer>();
        
        for(int i=0; i< nums.length; i++) {
            int o = target - nums[i];
            if(ht.containsKey(o)){
               return new int[]{i, ht.get(o)};
            }
            else {
                ht.put(nums[i],i);
            }
        }  
      return null;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {2,7,11,15};
		TwoSum ts = new TwoSum();
		System.out.println(ts.twoSum(nums,9));
	}

}
