package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KataExercises {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(5, 5)));

        System.out.println(solution(10));

        System.out.println(reverseString("world"));

        System.out.println(gradingStudents(List.of(73, 67, 38, 33)));

        System.out.println(Arrays.toString(topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
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

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();

        for (Integer grade : grades) {
            if (grade < 38) {
                result.add(grade);
            } else {
                int nextMultiple = ((grade / 5) + 1) * 5;

                if (nextMultiple - grade < 3) {
                    result.add(nextMultiple);
                } else {
                    result.add(grade);
                }
            }
        }

        return result;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> bucket[] = new ArrayList[nums.length + 1];

        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int res[] = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i >= 0; i--){
            if(bucket[i] != null){
                for(int val : bucket[i]){
                    res[index++] = val;
                    if(index == k) return res;
                }
            }
        }
        return res;
    }
}


