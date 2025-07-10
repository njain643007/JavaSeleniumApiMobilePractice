package javapractice;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumber {

    public static void main(String ... str){
        int[] arr = {1,2,4,5,6};
        int n = 6;
        int total = (n*(n+1))/2;
        for (int i : arr){
            total -= i;
        }
        System.out.println(total);
    }
}
