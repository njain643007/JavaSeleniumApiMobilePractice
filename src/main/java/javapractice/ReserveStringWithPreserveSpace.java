package javapractice;

import java.util.ArrayList;
import java.util.List;

public class ReserveStringWithPreserveSpace {

    public static void main(String ... ars){
        String str = "monday comes before tuesday";
        StringBuilder builder = new StringBuilder();
        List<Integer> space = new ArrayList<>();
        for(int i=0;i<str.length(); i++){
            if(str.charAt(i)==' '){
                space.add(i);
            }
        }
        int k=0;
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);

            if(space.contains(k)){
                builder.append(' ');
                k++;
            }
            if(ch!=' '){
                builder.append(str.charAt(i));
                k++;
            }
        }
        System.out.println(builder);
    }
}
