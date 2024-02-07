package String;

import java.util.*;

public class SortCharactersByFrequency {
    private static String formAString(Character c, int value){
        String result = "";
        while(value > 0){
            result += String.valueOf(c.charValue());
            value--;
        }
        return result;
    }

    public static String frequencySort(String s) {
        if(s.length() ==1){
            return s;
        }

        Map<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(Character.valueOf(c), map.getOrDefault(c,0)+1);
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(map.entrySet());
        Collections.sort(entryList, (entry1, entry2)-> entry2.getValue().compareTo(entry1.getValue()));

        Map<Character, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Character, Integer> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        String result="";
        for(Character c: sortedMap.keySet()){
            int value = sortedMap.get(c);
            result += formAString(c, value);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("loveleetcode"));
    }
}
