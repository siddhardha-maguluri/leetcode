package Recursion;

public class CountCollisonsOfMonkey {

    private static double result=0;

    private static void go(int n, double accumulator, double x){
        if(n==0){
            return;
        }
        result = accumulator*x;
        go(n-1, result,x);
    }
    public static double myPow(double x, int n) {
        go(n,1,x);
        return result;
    }

    public static int monkeyMove(int n){
        double result;
        if(n%2 !=0){
            result = (Math.pow(2,n)-4)%(Math.pow(10,9)+7);
        }
        else {
            result = (Math.pow(2,n)-2)%(Math.pow(10,9)+7);
        }
        return (int)result;
    }

    public static void main(String[] args) {
        //System.out.println(monkeyMove(55));
        System.out.println(myPow(0.00001,2147483647));
    }
}
