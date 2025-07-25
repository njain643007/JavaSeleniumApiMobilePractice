package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKeyAnValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("banana", 2);
        map.put("apple", 5);
        map.put("cherry", 3);

        Map<String, Integer> sortByKey = new TreeMap<>();
        map.forEach((k,v) -> sortByKey.put(k,v));

        System.out.println(sortByKey);
    }
}
