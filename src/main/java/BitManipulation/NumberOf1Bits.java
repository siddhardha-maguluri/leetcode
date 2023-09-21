package BitManipulation;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int noOf1Bits = 0;
        while(n !=0){
            noOf1Bits++;
            n = n & (n-1);
        }
        return noOf1Bits;
    }

    public static void main(String[] args) {
        System.out.println(NumberOf1Bits.hammingWeight(10));
    }
}
