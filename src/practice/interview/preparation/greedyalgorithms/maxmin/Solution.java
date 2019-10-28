package practice.interview.preparation.greedyalgorithms.maxmin;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int maxMin(int k, int[] arr) {
        int max, min;
        int fairness;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        max = arr[k-1];
        min = arr[0];

        fairness = max - min;
        for(int i = k; i < arr.length; i++) {
            if(arr[i]-arr[i-k+1] < fairness) {
                min = arr[i-k+1];
                max = arr[i];
                fairness = max - min;
            }
        }
        return fairness;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //int arr[] = {10, 100, 300, 200, 1000, 20, 30};
        //int arr[] = {1,2,3,4,10,20,30,40,100,200};
        int arr[] = {4504,
                1520,
                5857,
                4094,
                4157,
                3902,
                822,
                6643,
                2422,
                7288,
                8245,
                9948,
                2822,
                1784,
                7802,
                3142,
                9739,
                5629,
                5413,
                7232};
        //System.out.println(maxMin(3, arr));
        //System.out.println(maxMin(4, arr));
        System.out.println(maxMin(5, arr));

    }
}
