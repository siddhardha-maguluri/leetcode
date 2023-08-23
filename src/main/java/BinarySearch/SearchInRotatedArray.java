package BinarySearch;

public class SearchInRotatedArray {
    private static int binarySearch(int[] nums, int low, int high, int target){
        while(low <= high){
            int mid = (low+high) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[mid] > nums[n-1]){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }

        int result = binarySearch(nums,0,low-1,target);
        if(result != -1){
            return result;
        }

        return binarySearch(nums,low,n-1,target);
    }

    public static void main(String[] args){
        int[] arr = new int[]{5,1,3};
        int target  = 5;
        System.out.println(search(arr,5));
    }
}
