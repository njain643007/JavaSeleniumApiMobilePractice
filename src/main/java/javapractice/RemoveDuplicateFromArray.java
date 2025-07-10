package javapractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

    public static void main(String...strings){
        int[] arr = {4, 2, 9, 4, 2, 8};
        Set<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(Arrays.stream(set.stream().mapToInt(a->a).toArray()).count());
    }
}
