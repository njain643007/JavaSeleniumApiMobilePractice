package javapractice;

import java.util.*;

public class TensPositionCheck {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 79999, 6992, 99, 91, 24, 77, 96, 97));
        for(int i=0;i<list.size();i++){
            int temp = (Math.abs(list.get(i))/10)%10;
            if(temp == 9){
                System.out.println(i);
            }
        }
    }
}
