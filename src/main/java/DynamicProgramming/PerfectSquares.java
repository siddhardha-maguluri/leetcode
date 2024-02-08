package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectSquares {

    private static List<Integer> generateAllPerfectSquaresBelowN(int n){
        List<Integer> perfectSquares = new ArrayList<>();
        for(int i=1;i <= n; i++){
            if(i*i <= n){
                perfectSquares.add(i*i);
            } else {
                break;
            }
        }
        return perfectSquares;
    }

    private static int minPerfectSquares(int n, int currSum ,List<Integer> perfectSquares, int[] memo){
        if(currSum >= n){
            return 0;
        }

        if(memo[currSum] != -1){
            return memo[currSum];
        }

        int ans = 100000;
        for(int i=0; i<perfectSquares.size(); i++){
            int sum = currSum + perfectSquares.get(i);
            if(sum <= n){
                ans = Math.min(ans,1+minPerfectSquares(n,sum,perfectSquares,memo));
            }
        }

        memo[currSum] = ans;
        return memo[currSum];
    }

    public static int numSquares(int n) {
        List<Integer> perfectSquares = generateAllPerfectSquaresBelowN(n);
        int len = perfectSquares.size();

        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);

        return minPerfectSquares(n,0,perfectSquares,memo);
    }

    public static void main(String[] args) {
        System.out.println(numSquares(102));
    }

}
