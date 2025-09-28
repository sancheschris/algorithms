package algorithms;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
//        int[] nums = rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);

//        System.out.println(Arrays.toString(nums));

        int[] nums = rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
        rotateArrayImproved(nums, 2);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] rotateArray(int[] arr, int k) {
        int size = arr.length;
        k = k % size;

        for (int i = 0; i < k; i++) {
            int last = arr[size - 1];
            for (int j = size - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;
    }

    public static void rotateArrayImproved(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

