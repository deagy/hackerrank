package practice.interview.preparation.kit.string.manipulation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int count = 0;

        for (int i = 0; i < a.length(); i++) {

        }

        for(char i : a.toLowerCase().toCharArray()) {
            if(!b.toLowerCase().contains(""+i)) {
                count++;
            }
        }

        for(char i : b.toLowerCase().toCharArray()) {
            if(!a.toLowerCase().contains(""+i)) {
                count++;
            }
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

    public static void erase() {
        System.out.println("Test");
    }
}
