package BinarySearch;

import java.util.Arrays;

public class ShipPackagesInDDays {
    private static boolean feasible(int[] weights, int maxCapacity, int totalDays){
        int days = 1;
        int currentCapacity = 0;
        for(int weightIndex=0; weightIndex < weights.length; weightIndex++){
            currentCapacity += weights[weightIndex];
            if(currentCapacity > maxCapacity){
                currentCapacity = weights[weightIndex];
                days += 1;
                if(days > totalDays){
                    return false;
                }
            }
        }
        return true;
    }

    public static int shipWithinDays(int[] weights, int days) {

        int left = Arrays.stream(weights).max().orElse(0);
        int right = Arrays.stream(weights).sum();

        while(left < right){
            int mid = (left+right)/2;

            if(feasible(weights,mid,days)){
                right = mid;
            }
            else {
                left = mid+1;
            }
        }

        return left;
    }

    public static void main(String[] args){
        int[] weights = new int[]{1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights,days));
    }
}
