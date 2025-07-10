package javapractice;

import java.util.HashMap;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 17;
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int com = target - arr[i];
            if(map.containsKey(com)){
                result[0] = map.get(com);
                result[1] = i;
            }
            map.put(arr[i], i);
        }
       for(int i:result){
           System.out.print(i+" ");
       }
    }
}
