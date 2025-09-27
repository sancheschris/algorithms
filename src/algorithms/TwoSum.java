package algorithms;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = twoSumBruteForce(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = twoSum(new int[]{2, 7, 11, 15}, 26);
        System.out.println(Arrays.toString(arr2));
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

    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}
