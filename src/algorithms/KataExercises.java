package algorithms;

import java.util.Arrays;

public class KataExercises {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(5, 5)));
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
}


