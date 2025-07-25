package javapractice;

public class AnyCode {
    public static void main(String[] args) {
        int[] arr = {6,5,4,7,11,2};
        // third highest element

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for(int a:arr){
            if(a>max){
                max = a;
            }
        }
        System.out.println("Max - "+max);
        for(int a:arr){
            if(a>secMax && a!=max){
                secMax = a;
            }
        }
        System.out.println("Sec Max - "+secMax);

        for(int a:arr){
            if(a>thirdMax && a!=secMax && a!=max){
                thirdMax = a;
            }
        }
        System.out.println("Third Max - "+thirdMax);



    }
}
