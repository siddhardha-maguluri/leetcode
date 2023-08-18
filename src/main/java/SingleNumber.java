import java.util.Enumeration;
import java.util.Hashtable;

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
		
		/* i am storing the numbers in the array as a key and their count as 
		 * a value in a hash table. Then, I am iterating the hashtable, if the key 
		 * has a value 1, i am returning it, because that key is the number that 
		 * is not repeated twice in given nums array.
		 * 
		 * The time complexity is O(N).
		 */

        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
			 if(ht.get(nums[i]) != null){
				ht.put(nums[i], ht.get(nums[i])+1);
	         }
	         else{
	            ht.put(nums[i],1);
	         }
	    }

       Enumeration<Integer> keys = ht.keys();
       while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            int value = ht.get(key);
            if(value == 1)
                return key;
        }
       return -1;
    }

	public static void main(String[] args) {
		int[] nums = new int[] {2,2,1};
		SingleNumber sn = new SingleNumber();
		System.out.println(sn.singleNumber(nums));

	}

}
