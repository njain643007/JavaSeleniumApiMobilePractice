package javapractice;

public class MoveAllZeroAtFirst {

    public static void main(String ... str){
        int[] arr = {0, 1, 0, 3, 12};
        int n = arr.length;
        int insert = n-1;
        for(int i = n-1;i>=0;i--){
            if(arr[i]!=0) {
                arr[insert--] = arr[i];
            }
        }
        while(insert>=0){
            arr[insert--] = 0;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
