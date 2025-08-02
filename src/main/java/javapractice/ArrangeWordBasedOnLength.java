package javapractice;

import java.math.BigInteger;
import java.util.*;

public class ArrangeWordBasedOnLength {
    public static void main(String[] args) {
        String input = "sort this string based on word length";
        String[] words = input.split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        String result = String.join(" ", words);
        System.out.println(result);

    }
}
