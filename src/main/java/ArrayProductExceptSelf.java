public class ArrayProductExceptSelf {
	
	/* Another approach is to use concept similar to prefix sum. This approach's 
	 * time complexity is O(N).
	 */
	public int[] productExceptSelf(int[] nums) {
		
		int[] prefix = new int[nums.length];
		
		int product = 1;
		for(int i=0;i< nums.length; i++) {
			prefix[i] = product;
			product *= nums[i];
		}
		
		int product1 = 1;
		for(int j = (nums.length-1); j >=0; j--) {
			prefix[j] = prefix[j] * product1;
			product1 *= nums[j];
		}
		    
		return prefix;
    }

	public static void main(String[] args) {
		int nums[] = new int[] {1,2,3,4};
		ArrayProductExceptSelf ap = new ArrayProductExceptSelf();
		System.out.println(ap.productExceptSelf(nums)[0]);

	}

}
