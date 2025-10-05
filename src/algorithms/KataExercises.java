package algorithms;

import java.util.Arrays;

public class KataExercises {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(5, 5)));

        System.out.println(solution(10));

        System.out.println(reverseString("world"));
    }

    //Create a function with two arguments that will return an array of the first n multiples of x.
    //
    //Assume both the given number and the number of times to count will be positive numbers greater than 0.
    //
    //Return the results as an array or list ( depending on language ).
    //
    //Examples
    //x = 1, n = 10 --> [1,2,3,4,5,6,7,8,9,10]
    //x = 2, n = 5  --> [2,4,6,8,10]

    public static int[] countBy(int x, int n) {
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = x * (i + 1);
        }
        return result;
    }

    //    Can you find the needle in the haystack?
    //
    //Write a function findNeedle() that takes an array full of junk but containing one "needle"
    //
    //After your function finds the needle it should return a message (as a string) that says:
    //
    //"found the needle at position " plus the index it found the needle, so:
    //
    //Example(Input --> Output)
    //
    //["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                return "found the needle at position " + i;
            }
        }
        return "";
    }

    //    if we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
    //
    //Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
    //
    //Note: If a number is a multiple of both 3 and 5, only count it once.
    public static int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    //    Complete the solution so that it reverses the string passed into it.
    //
    //'world'  =>  'dlrow'
    //'word'   =>  'drow'
    public static String reverseString(String s) {

        char[] chars = s.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }
        return "";
    }
}


