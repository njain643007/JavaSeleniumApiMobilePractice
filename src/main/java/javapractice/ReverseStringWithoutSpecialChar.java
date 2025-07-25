package javapractice;

import java.util.regex.Pattern;

public class ReverseStringWithoutSpecialChar {
    public static void main(String[] args) {
        String s = "ai#$un*f";
        char[] ch = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(!Character.isLetter(ch[i])){
                i++;
            }
            if(!Character.isLetter(ch[j])){
                j--;
            }
            if(Character.isLetter(ch[i]) &&  Character.isLetter(ch[j])) {
                char temp = ch[i];
                ch[i++] = ch[j];
                ch[j--] = temp;
            }
        }
        System.out.println(new String(ch));
    }
}
