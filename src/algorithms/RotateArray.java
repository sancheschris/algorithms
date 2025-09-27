package algorithms;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);

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
}

