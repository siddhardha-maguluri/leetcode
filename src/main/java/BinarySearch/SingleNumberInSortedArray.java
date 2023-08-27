package BinarySearch;

public class SingleNumberInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        if(nums.length == 1){
            return nums[0];
        }
        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]){
                return nums[mid];
            }
            else if(nums[mid] == nums[mid-1]){
                if((right-mid)%2 == 0){
                    right = mid;
                }
                else {
                    left = mid+1;
                }
            }
            else if(nums[mid] == nums[mid+1]){
                if((right-mid)%2 ==0){
                    left = mid;
                }
                else {
                    right = mid-1;
                }
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};
        System.out.println(singleNonDuplicate(nums));
    }
}
