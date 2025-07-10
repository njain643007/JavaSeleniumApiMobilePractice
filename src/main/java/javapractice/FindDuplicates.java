package javapractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates {

    public static void main(String ... str){
        int[] arr = {4, 2, 7, 4, 9, 2, 1, 7};
        Set<Integer> seen = new LinkedHashSet<>();
        Set<Integer> unseen = new LinkedHashSet<>();
        for (int i : arr){
            if(!seen.add(i)){
            unseen.add(i);}
        }
        System.out.println(unseen);
    }
}
