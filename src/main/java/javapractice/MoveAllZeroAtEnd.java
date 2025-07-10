package javapractice;

public class MoveAllZeroAtEnd {

    public static void main(String ... str){
        int[] arr = {0, 1, 0, 3, 12};
        int insert = 0;
        for(int num : arr){
            if(num != 0){
                arr[insert++] = num;
            }
        }
        while(insert<arr.length){
            arr[insert++] = 0;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
