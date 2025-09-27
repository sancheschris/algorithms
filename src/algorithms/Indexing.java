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
            System.out.println("-");
        }

        // Reverse partial
        int[] partial = {3, 6, 9, 10, 15};
        reversePartial(partial, 2, 4);
        System.out.println(Arrays.toString(partial));

        // Reverse words
        System.out.println(reverseWords("the sky is blue"));
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

    public static void reversePartial(int[] arr, int i, int j) {
        if (i < 0 || j >= arr.length || i >= j) {
            throw new IllegalArgumentException("Invalid index");
        }

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        char[] chars = s.toCharArray();

        reverseChar(chars, 0, chars.length - 1);

        int start = 0;
        for (int end = 0; end <= chars.length; end++) {
            if (end == chars.length || chars[end] == ' ') {
                reverseChar(chars, start, end - 1);
                start = end + 1;
            }
        }
        return Arrays.toString(chars);
    }

    public static void reverseChar (char[] chars, int i, int j) {
        while(i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
    }
}
