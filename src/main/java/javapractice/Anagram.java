package javapractice;

import java.util.Arrays;

public class Anagram {
    public static void main(String...strings){
        String s1 = "listen";
        String s2 = "silent";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1, ch2));
    }
}
