package BinarySearch;

import java.util.Arrays;

public class PeakIndexInMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int left = 1;
        int right = n-1;

        while(left <= right){
            int mid = (left+right)/2;

            if(arr[mid] > arr[mid+1] && arr[mid-1] < arr[mid]){
                return mid;
            }
            else if(arr[mid] < arr[mid+1]) {
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = new int[]{0,10,5,2};
        Arrays.stream(arr).sum();
        System.out.println(peakIndexInMountainArray(arr));
    }
}
