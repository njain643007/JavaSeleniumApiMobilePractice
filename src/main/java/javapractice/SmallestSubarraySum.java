package javapractice;

public class SmallestSubarraySum {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 1, 7, 1, 3};
        int target = 11;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        for(int end = 0;end<nums.length; end++){
            sum += nums[end];
            while(sum>=target){
                if(sum == target){
                    minLength = Math.min(minLength, end-start+1);
                }
                sum -= nums[start];
                start++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            System.out.println("No subarray found with sum = " + target);
        } else {
            System.out.println("Smallest subarray length with sum " + target + " is: " + minLength);
        }
    }
}
