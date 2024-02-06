package String;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.copyValueOf(chars);

            if(map.containsKey(key)){
                List<String> temp = map.get(key);
                temp.add(s);
                map.put(key,temp);
            } else {
                List<String> t = new ArrayList<>();
                t.add(s);
                map.put(key,t);
            }
        }

        for(List<String> l: map.values()){
            result.add(l);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"tea","and","ace","ad","eat","dans"}));
    }
}
