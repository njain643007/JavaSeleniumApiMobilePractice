package javapractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubString {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        Map<Character, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0, start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        System.out.println(s.substring(start, start + maxLen));
       }
    }

