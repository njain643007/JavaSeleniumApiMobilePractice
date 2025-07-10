package javapractice;

public class Test3 {

    public static void main(String ... ars){
        int[] arr = {1,3,0,5,6,8,0,10};
        int[] result = new int[arr.length];
        int countzeros = 0;
        int k = 0;
        for(int i:arr){
            if(i==0){
                countzeros++;
                result[k++] = 0;
            }
        }

        for(int i: arr){
            if(i!=0){
            result[k++] = i;
            }
        }
        for(int i: result){
            System.out.print(i+" ");
        }
    }
}
