package dev.code.hrank.strings;

import java.util.Scanner;

/**
 * Created by shreeprakash on 1/11/16.
 */
public class MaximumSubArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numOfTestCases = Integer.valueOf(scanner.nextLine());
        int str[][] = new int[numOfTestCases][];
        for (int j = 0; j < numOfTestCases; j++) {
            int len = Integer.valueOf(scanner.nextLine());
            String arrStr = scanner.nextLine();
            String arrStrSplit[] = arrStr.split(" ");
            str[j] = new int[arrStrSplit.length];
            for (int i = 0; i < len; i++) {
                str[j][i] = Integer.valueOf(arrStrSplit[i]);
            }
        }
        for (int i = 0; i < numOfTestCases; i++) {
            int max_so_far = 0, max_curr = 0, max_non_cont = 0, max_abs = Integer.MAX_VALUE;
            for (int j = 0; j < str[i].length; j++) {
                if (str[i][j] > 0) {
                    max_non_cont += str[i][j];
                }
                max_curr += str[i][j];
                if (max_curr > max_so_far) {
                    max_so_far = max_curr;
                }
                if (max_curr < 0) {
                    if (Math.abs(max_curr) <= max_abs) {
                        max_abs = Math.abs(max_curr);
                    }
                    max_curr = 0;
                    continue;
                }
            }
            System.out.println((max_so_far > 0 ? max_so_far : max_abs*-1) + " " + (max_non_cont > 0 ? max_non_cont : max_abs*-1));
        }


    }
}
