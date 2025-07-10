package javapractice;

public class UpperAndLower {

    public static void main(String ... strings){
        String s = "aBCd";
        StringBuilder builder = new StringBuilder();

        for(int i=0; i<s.length();i++){
            int ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                builder.append((char) (ch+32));
            }
            else{
                builder.append((char) (ch-32));

            }
        }

        System.out.println(builder);

    }
}
