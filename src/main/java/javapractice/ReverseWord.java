package javapractice;

import java.util.Scanner;

public class ReverseWord {

    public static void main(String...strings){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Word");
        String str = scanner.nextLine();
        StringBuilder build = new StringBuilder();
        String[] spiltStr = str.split(" ");
        for(int i=spiltStr.length-1;i>=0;i--){
            build.append(spiltStr[i]+" ");
        }
        System.out.println(build.toString().trim());
    }
}
