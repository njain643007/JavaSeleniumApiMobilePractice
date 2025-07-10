package javapractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static void main(String[] string) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        String str = scanner.next();
        boolean[] countChar = new boolean[256];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!countChar[ch]){
                countChar[ch] = true;
                builder.append(ch);
            }
        }
        System.out.println(builder);
    }
}
