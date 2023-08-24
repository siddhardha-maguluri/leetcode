package TwoPointers;

public class IsPalindrome {

    public static boolean isPalindrome(String s) {
        String cleanString = s.toLowerCase().replaceAll("[,0-9:\s]+", "");
        System.out.println(cleanString);
        for(int i=0, j=(cleanString.length()-1); i<=j ; i++,j--){
            if(cleanString.charAt(i) != cleanString.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0aBbA"));
    }
}
