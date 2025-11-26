package algorithms;

public class MaximumSubArray {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j< nums.length; j++) {
                sum += nums[j];
                max = findMax(max, sum);
            }
        }
        return max;
    }

    static int findMax(int a, int b) {
        return a > b ? a : b;
    }
}
