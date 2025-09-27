package algorithms;

import java.util.Arrays;

public class Indexing {
    public static void main(String[] args) {

        int[] nums = {10, 20, 30, 40, 50};

        reverse(nums);
        System.out.println(Arrays.toString(nums));


        // Reverse with for loop
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[nums.length - 1 - i]);
//        }

        // Reverse with for loop
//        for (int i = nums.length - 1; i >= 0; i--) {
//            System.out.println(nums[i]);
//        }


        // Reverse a string
        String reversed = reverseString("HelloWorld");
        System.out.println(reversed);

        String reverse2 = "Algorithms";
        char[] chars = reverse2.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);

        }
    }

    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
