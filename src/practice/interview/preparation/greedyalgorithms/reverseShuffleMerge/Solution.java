package practice.interview.preparation.greedyalgorithms.reverseShuffleMerge;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static String reverseShuffleMerge(String s) {
        char chars[] = s.toCharArray();
        StringBuilder a, b;
        a = new StringBuilder();
        b = new StringBuilder();

        Arrays.sort(chars);

        for (int i = 0; i < chars.length; i++) {
            if(i%2 == 0) {
                a.append(chars[i]);
            }
            else {
                b.append(chars[i]);
            }
        }



        return a.toString();
    }

    static String reverse(String a) {
        StringBuilder retString = new StringBuilder();

        for (int i = a.length()-1; i <= 0; i--) {
            retString.append(a.charAt(i));
        }

        return retString.toString();
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(reverseShuffleMerge("eggegg"));

    }
}
