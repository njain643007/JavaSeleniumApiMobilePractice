package javapractice;

import java.util.HashMap;
import java.util.Map;

public class CountNumbers {
    public static void main(String[] args) {
        String s = "viaks";
        System.out.println(countMax(s));
    }

    public static String countMax(String str) {
        StringBuilder builder = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (Character ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            max = Math.max(max, map.get(ch));
        }
//        System.out.println(max);
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (max == m.getValue()) {
                builder.append(m.getKey());
            }
        }

        return builder.toString();
    }
}
