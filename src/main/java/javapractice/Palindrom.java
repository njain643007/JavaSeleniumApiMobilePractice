package javapractice;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] string){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value");
        String str = scanner.next();
        char[] ch = str.toCharArray();
        int i=0;
        int  j =ch.length-1;
        int temp = 0;
        while(i<=j){
            if(ch[i]!=ch[j]){
                temp = 1;
                break;
            }
            i++;
            j--;
        }
        if(temp==0){
            System.out.println(str+" value is palindrom");
        }
        else{
            System.out.println(str+" value is not palindrom");

        }
    }
}
