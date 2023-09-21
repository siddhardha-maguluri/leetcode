package DivideAndConquer;

public class MajorityElement {

    private static int findMajority(int[] nums, int left, int right){
        if(left == right){
            return nums[left];
        }

        // dividing array into subarray recursively
        int mid = (left+right)/2;
        int left_majority = findMajority(nums,left,mid);
        int right_majority = findMajority(nums,mid+1,right);

        if(left_majority == right_majority){
            return left_majority;
        }

        //merging the subarrays and checking the majority element in the combined array.
        int left_count=0,right_count = 0;
        for(int i=left; i <= right; i++){
            if(nums[i] == left_majority){
                left_count++;
            }
            if(nums[i] == right_majority){
                right_count++;
            }
        }

        if(left_count > right_count){
            return left_majority;
        }
        else {
            return right_majority;
        }
    }

    public static int majorityElement(int[] nums) {
        return findMajority(nums, 0, nums.length-1);
    }


    public static int majorityElementUsingBoyerMooreAlgorith(int[] nums){
        int majorityElement =nums[0];
        int counter =0;

        for(int num: nums){
            if(counter ==0){
                majorityElement = num;
                counter = 1;
            }
            else if(num == majorityElement){
                counter++;
            }
            else {
                counter--;
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,1,2};
        System.out.println(majorityElementUsingBoyerMooreAlgorith(nums));
    }
}
