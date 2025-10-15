package algorithms;

import java.util.List;

public class Hackerrank {

    public static void main(String[] args) {

        System.out.println(countResponseTimeRegressions(List.of(100, 200, 100, 200, 100)));

        System.out.println(findSmallestMissingPositive(List.of(3, 4, -1, 1)));
        System.out.println(findSmallestMissingPositive(List.of(5, 4, -2, 1, -1)));

        System.out.println(isNonTrivialRotation("abcde", "cdeab"));
    }


//    Count Elements Greater Than Previous Average
//Given an array of positive integers, return the number of elements that are strictly greater than the average of all previous elements. Skip the first element.
    //
    //Example
    //
    //Input
    //
    //responseTimes = [100, 200, 150,300]
    //Output
    //
    //2
    //Explanation
    //
    //- Day 0: 100 (no previous days, skip)
    //- Day 1: 200 > average(100) = 100 → count = 1
    //- Day 2: 150 vs average(100, 200) = 150 → not greater → count = 1
    //- Day 3: 300 > average(100, 200, 150) = 150 → count = 2 Ret
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
        // Write your code here
        int count = 0;
        double previous = 0;

        for (int i = 1; i < responseTimes.size(); i++) {
            previous += responseTimes.get(i - 1);
            double average = previous / i;
            if (responseTimes.get(i) > average) {
                count++;
            }
        }
        return count;
    }

    public static int findSmallestMissingPositive(List<Integer> orderNumbers) {
        int n = orderNumbers.size();
        int i = 0;

        // Place each number in its correct position: num i → index (num - 1)
        while (i < n) {
            int num = orderNumbers.get(i);
            int correctPos = num - 1;

            if (num > 0 && num <= n && !orderNumbers.get(correctPos).equals(num)) {
                // Swap orderNumbers[i] ↔ orderNumbers[correctPos]
                int temp = orderNumbers.get(correctPos);
                orderNumbers.set(correctPos, num);
                orderNumbers.set(i, temp);
            } else {
                i++;
            }
        }

        // After sorting, the first index i where value != i+1 is the missing number
        for (i = 0; i < n; i++) {
            if (orderNumbers.get(i) != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are in place
        return n + 1;
    }

    public static boolean isNonTrivialRotation(String s1, String s2) {
        // Write your code here
        if (s1.length() != s2.length()) {
            return false;
        }

        if (s1.equals(s2)) {
            return false;
        }


        char[] nonIdentical = s2.toLowerCase().toCharArray();
        int k = s1.length() - 1;
        k = k % nonIdentical.length;

        swap(nonIdentical, 0, k - 1);
        swap(nonIdentical, k, nonIdentical.length - 1);
        swap(nonIdentical, 0, nonIdentical.length - 1);

        for (int i = 0; i < nonIdentical.length; i ++) {
            if (nonIdentical[i] != s1.toLowerCase().charAt(i)) {
                return true;
            }
        }

        return false;
    }

    public static void swap(char[] words, int left, int right) {
        while (left < right) {
            char temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
    }
}
