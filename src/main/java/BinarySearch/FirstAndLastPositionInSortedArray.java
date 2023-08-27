package BinarySearch;

public class FirstAndLastPositionInSortedArray {
    public static int lowerBound(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int answer = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                answer=mid;
                high = mid -1;
            }
            else if(nums[mid] < target) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return answer;
    }

    public static int upperBound(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int answer = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                answer = mid;
                low = mid + 1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {5,7,7,8,8,10};
        System.out.println(lowerBound(nums,8));
        System.out.println(upperBound(nums,8));
    }
}
