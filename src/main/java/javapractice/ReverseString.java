package javapractice;

public class ReverseString {

    public static void main(String[] strings){
        String str = "nikhil";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }
}
