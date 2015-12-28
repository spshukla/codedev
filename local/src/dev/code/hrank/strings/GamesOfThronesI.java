package dev.code.hrank.strings;

import java.util.Scanner;

/**
 * Created by shreeprakash on 12/26/15.
 */
public class GamesOfThronesI {
    public static void main(String args[]) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();

        String ans = "YES";
        int len = inputString.length();
        int arr[] = new int[255];
        for (int i = 0; i < len; i++) {
            arr[inputString.charAt(i)] += 1;
        }

        int countWithEvenCounts = 0;
        int countWithOddCounts = 0;

        for (int i = 0; i < 255; i++) {
            if (arr[i] != 0) {
                if (arr[i] % 2 == 0) {
                    countWithEvenCounts++;
                } else {
                    countWithOddCounts++;
                }
            }
        }

        if (len % 2 == 0) {
            if (countWithOddCounts > 0 || countWithEvenCounts == 0) {
                ans = "NO";
            }
        } else {
            if (countWithOddCounts > 1 || countWithOddCounts == 0 || countWithEvenCounts == 0) {
                ans = "NO";
            }
        }

        if(inputString.length() == 1) {
            ans = "YES";
        }

        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
}
