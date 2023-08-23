package BinarySearch;

import java.util.Arrays;

public class SmallestCommonElement {

    public static int smallestCommonElement(int[][] mat) {
        int smallestCommon = Integer.MAX_VALUE;

        for(int i=0; i < mat[0].length; i++){
            int currElement = mat[0][i];
            int count =0;
            for(int[] row: mat){
                if(Arrays.binarySearch(row, currElement) >=0){
                    count++;
                    continue;
                }
                else{
                    break;
                }
            }
            if(count == mat.length){
               smallestCommon = Math.min(smallestCommon,currElement);
            }
        }
        return smallestCommon == -999 ? -1 : smallestCommon;
    }

    public static void main(String[] args){
        int[][] mat = new int[][]{{1,2,3},{2,3,4},{2,3,5}};
        System.out.println(smallestCommonElement(mat));
    }
}
