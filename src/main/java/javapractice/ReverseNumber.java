package javapractice;

public class ReverseNumber {
    public static void main(String...args){
        int num = 657687989;

        int revNum = 0, lastDigit;
        while(num!=0){
            lastDigit = num%10;
            if (revNum > Integer.MAX_VALUE/10 || revNum < Integer.MIN_VALUE/10) {
                System.out.println("Overflow occurred!");
                System.out.println(0);
                break;
            }
            revNum = revNum*10+lastDigit;
            num = num/10;
        }
        System.out.println(revNum);
    }
}
