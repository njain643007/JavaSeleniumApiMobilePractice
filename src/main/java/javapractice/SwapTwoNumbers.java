package javapractice;

public class SwapTwoNumbers {

    public static void main(String ...str){

        int a = 20;
        int b = 10;
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a);
        System.out.println(b);
    }
}
