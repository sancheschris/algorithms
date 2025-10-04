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
}


