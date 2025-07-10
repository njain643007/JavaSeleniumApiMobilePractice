package javapractice;

import java.util.*;

public class GroupAnagram {

    public static void main(String... str) {
        List<String> list = Arrays.asList("listen", "silent", "enlist", "google", "gooegl");
        findAnagramsGroup(list);
    }
    public static void findAnagramsGroup(List<String> words){
        Map<String, List<String>> result = new HashMap<>();
        for(String word:words){
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);
            result.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }
        for(List<String> groups : result.values()){
            if(groups.size()>1){
                System.out.println(groups);
            }
        }
    }
}
