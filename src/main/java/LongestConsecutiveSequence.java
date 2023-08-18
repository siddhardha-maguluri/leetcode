import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence {
	
	 public static String encode(List<String> strs) {
	        StringBuilder sb = new StringBuilder();
	        
	        for(String str:strs) {
	        	sb.append(str.length())
	        	.append('#')
	        	.append(str);
	        }
	        
	        return sb.toString();
	}
	 
	public static List<String> decode(String s) {
	        List<String> result = new ArrayList();

	        int i = 0;

	        while(i < s.length()){
	            int index = i;

	            while(s.charAt(index) != '#'){
	                index++;
	            }

	            int currStringLen = Integer.valueOf(s.substring(i,index));
	            i = index + 1 + currStringLen;
	            result.add(s.substring(index+1, i));
	        }
	        
	        return result;
	    }

	
	public static int longestConsecutive(int[] nums) {

        if(nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        int currCount = 1;
        int result = 0;
        
        for(int i=1; i < nums.length; i++){
            if(nums[i] == (nums[i-1]+1)){
                currCount++;
            }
            else if(nums[i] == nums[i-1]) {
            	continue;
            }
            else {
                result = Math.max(result, currCount);
                currCount = 1;
            }   
        }

        return Math.max(currCount, result);
    }
	
	public static boolean checkIfLeftExists(Set s, int number) {
		return s.contains(number-1);
	}

	public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap(); 
        for(int num:nums){
        	map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        ArrayList<Map.Entry<Integer,Integer>> entryList = new ArrayList(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        System.out.println(map);
        

        return new int[2];
    }
	
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
	
	public static int findMin(int[] nums) {    
        int low = 0;
        int high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;     
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }    

        return nums[low];
    }
	
	public static int evalRPN(String[] tokens) {
		
        Stack<String> st = new Stack();
        
        for(int i=0; i < tokens.length; i++){
        	String token = tokens[i];
        	if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int num2 = Integer.parseInt(st.pop());
                int num1 = Integer.parseInt(st.pop());

                int result=0;

                if(token == "+")
                    result = num1 + num2;
                else if(token == "-")
                    result = num1 - num2;
                else if(token == "*")
                    result = num1 * num2;
                else if(token == "/")
                    result = num1/num2;

                st.push(Integer.toString(result));
            }
            else{
            	st.push(token);
            }
        }

        return Integer.parseInt(st.pop());
    }
	
	public static int lengthOfLongestSubstring(String s) {
//        int left = 0;
//        int right = left+1;
//        int maxLength = 0;
//
//        while(left <= (s.length()-1)){
//            String currStr = "" + s.charAt(left);
//            int currLen = 0;
//            while(right <= (s.length()-1) && !currStr.contains(""+s.charAt(right))){
//            	currStr += s.charAt(right);
//                right++;
//            }
//            currLen = right-left;
//            maxLength = Math.max(maxLength, currLen);
//            left++;
//            right=left+1;
//        }
//
//        return maxLength;
		
		Set<Character> set = new HashSet();
		
		int left = 0;
		int maxLen = 0;
		
		for(int right=0; right < s.length(); right++) {
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			set.add(s.charAt(right));
			maxLen = Math.max(maxLen, (right-left+1));
		}
		
		return maxLen;
    }

	public static void main(String[] args) {
		//int arr[] = new int[] {2,2,3,1,1,1};
//		System.out.println(longestConsecutive(arr));
		
		//System.out.println(decode(encode(Arrays.asList("Leet","code"))));
		
		//topKFrequent(arr,2);
		
		//System.out.println("a, 6: plan".toLowerCase().replaceAll("[,0-9:\s]+", ""));
		
		//isPalindrome("0P");
		
		//int[] nums = {5,1,2,3,4};
//		String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
//		System.out.println(evalRPN(tokens));
		
		System.out.println("10".split("")[1]);
		
		//System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

}
