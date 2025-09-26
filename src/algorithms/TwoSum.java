package algorithms;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = twoSumBruteForce(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
