package algorithms;

import java.util.List;

public class Hackerrank {

    public static void main(String[] args) {

        System.out.println(countResponseTimeRegressions(List.of(100, 200, 100, 200, 100)));
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


}
