package javapractice;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String...str1){
        String str = "automation";
        Map<Character, Integer> charCount = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            charCount.put(str.charAt(i), charCount.getOrDefault(str.charAt(i), 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: charCount.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
        System.out.println("-");
    }
}
