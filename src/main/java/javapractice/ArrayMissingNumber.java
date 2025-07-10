package javapractice;

import java.util.Arrays;

public class ArrayMissingNumber {
    public static void main(String...strings){
        int[] arr = {1, 2, 4, 5};
        int n = arr.length+1;
        int expectedSum = (n*(n+1))/2;
        int actualSum = Arrays.stream(arr).sum();
        System.out.println(expectedSum-actualSum);
    }
}
