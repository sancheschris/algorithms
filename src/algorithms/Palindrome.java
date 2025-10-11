package algorithms;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindromeBruteForce("Was it a car or a cat I saw?"));
        System.out.println(isPalindromeBruteForce("tab a cat"));


        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));


        System.out.println(isAlphabeticPalindrome("tab a cat"));
    }

    public static boolean isPalindromeBruteForce(String s) {

        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        char[] original = cleaned.toString().toCharArray();

        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[i];
        }

        int left = 0;
        int right = reversed.length - 1;

        reverse(reversed, left, right);

//        while (left < right) {
//            char temp = reversed[left];
//            reversed[left] = reversed[right];
//            reversed[right] = temp;
//            left++;
//            right--;
//        }

       for (int i = 0; i < original.length; i++) {
           if (reversed[i] != original[i]) {
               return false;
           }
       }
        return true;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static boolean isAlphabeticPalindrome(String code) {
        String onlyLetters = code.replaceAll("[^A-Za-z]", "").toLowerCase();

        int left = 0;
        int right = onlyLetters.length() - 1;

        while (left < right) {
            if (onlyLetters.charAt(left) != onlyLetters.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }

}

