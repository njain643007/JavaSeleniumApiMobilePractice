package javapractice;

public class Test4 {
    public static void main(String ... ars){
        int[] nums = {1, -1, 3, -2, -3, 5, 6, -7};
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                int temp = nums[i];
                int j = i;

                // Shift non-negatives to the right
                while (j > 0 && nums[j - 1] >= 0) {
                    nums[j] = nums[j - 1];
                    j--;
                }

                // Place the negative number
                nums[j] = temp;
            }
        }
        for(int k:nums){
            System.out.print(k+" ");
        }
    }
}
