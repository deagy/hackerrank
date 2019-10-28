package practice.interview.preparation.greedyalgorithms.minimum;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    // Complete the minimumAbsoluteDifference function below.
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int first = arr[0];
        int second = arr[1];
        int diff = Math.abs(first-second);

        for (int i = 2; i < arr.length; i++) {
            if(Math.abs(arr[i] - arr[i-1]) < diff) {
                first = arr[i-1];
                second =arr[i];
                diff = Math.abs(first-second);
            }
        }
        return diff;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int arr[]= {3, -7, 0};
        int arr[] = {1, -3, 71, 68, 17};

        System.out.println("Output: " + minimumAbsoluteDifference(arr));
    }
}
