package javapractice;

public class Regex {
    public static void main(String[] args) {
        String str = "Hello@34% Wor$ld";

        String modify = str.replaceAll("[a-zA-Z0-9]+","");
        System.out.println("Only Special Char " + modify);
        modify = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Remove Special Char "+modify);

        modify = str.replaceAll("\\D","");
        System.out.println("only number "+modify);
        modify = str.replaceAll("\\s","");
        System.out.println("remove space "+modify);

    }
}
