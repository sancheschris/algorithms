package algorithms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateExercise {

    public static void main(String[] args) {
        boolean isDuplicate = containsDuplicate(new int[]{1, 2, 3, 1});
        boolean isDuplicate2 = containsDuplicateBrutalForce(new int[]{1, 2, 3, 4});

        System.out.println(isDuplicate);
        System.out.println(isDuplicate2);
    }

    public static boolean containsDuplicateBrutalForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

}