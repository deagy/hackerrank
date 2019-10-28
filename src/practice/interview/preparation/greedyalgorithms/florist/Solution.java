package practice.interview.preparation.greedyalgorithms.florist;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    // Complete the minimumAbsoluteDifference function below.
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int ans = 0;
        int prev = 0, customer = 0;

        for (int i = c.length - 1; i >= 0; i--) {
            ans += c[i] * (prev +1);

            customer++;

            if(customer == k) {
                customer = 0;
                prev++;
            }
        }
        return ans;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int arr[]= {3, -7, 0};
    }
}
