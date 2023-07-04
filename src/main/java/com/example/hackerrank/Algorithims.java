package com.example.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Algorithims {

//    Q #1
//    class Result {
//        /*
//         * Complete the 'plusMinus' function below.
//         *
//         * The function accepts INTEGER_ARRAY arr as parameter.
//         */
//        public static void plusMinus(List<Integer> arr) {
//            // Write your code here
//        }
//    }
//    public class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            int n = Integer.parseInt(bufferedReader.readLine().trim());
//            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                    .map(Integer::parseInt)
//                    .collect(toList());
//            Result.plusMinus(arr);
//            bufferedReader.close();
//        }
//    }



//    A #1
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.######");
        decimalFormat.setDecimalSeparatorAlwaysShown(false);

        System.out.println(decimalFormat.format((double) positiveCount / arr.size()));
        System.out.println(decimalFormat.format((double) negativeCount / arr.size()));
        System.out.println(decimalFormat.format((double) zeroCount / arr.size()));
    }
}

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.plusMinus(arr);

            bufferedReader.close();
        }
    }

}
