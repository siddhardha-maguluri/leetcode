public class LongestCommonSubsequence {
	
	private int lcs(String text1, String text2, int m, int n) {
	    if (m == text1.length() || n >= text2.length() ) {
	        return 0;
	    } else if (text1.charAt(m) == text2.charAt(n)) {
	        return 1 + lcs(text1, text2, m+1, n+1);
	    } else {
	        return Math.max(lcs(text1, text2, m, n+1), lcs(text1, text2, m+1, n));
	    }
	}
		
	public int longestCommonSubsequence(String text1, String text2) {
		
		return lcs(text1, text2, 0, 0);
    }
	
	public static void main(String[] args) {
		
		LongestCommonSubsequence lcs = new LongestCommonSubsequence();
		System.out.println(lcs.longestCommonSubsequence("abcde", "acde"));
	}

}
