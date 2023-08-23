package BinarySearch;

public class MinimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int n = nums.length;
        int left  = 0;
        int right = n-1;

        while(left <= right){
            int mid = (left+right)/2;

            if(nums[mid]>nums[n-1]){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }

        return nums[left];
    }
    public static void main(String[] args){
        int[] arr = new int[]{4,5,6,1,2,3};
        System.out.println(findMin(arr));
    }
}
