import java.util.Arrays;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {    	
    	Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        
    	
    	return new int[][] {{}};
    }
	
	public static void main(String[] args) {
		int[][] arr = new int[][]{{1,3},{2,6}, {8,10}, {15,18}};
		merge(arr);
	}
}
