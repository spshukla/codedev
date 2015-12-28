package dev.code.hrank.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by shreeprakash on 12/26/15.
 */
public class TwoStrings {
    public static void main(String args[]) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.valueOf(bufferedReader.readLine());
        ArrayList<String> inputAString = new ArrayList<>();
        ArrayList<String> inputBString = new ArrayList<>();
        for (int i = 0; i < val; i++) {
            inputAString.add(bufferedReader.readLine());
            inputBString.add(bufferedReader.readLine());
        }
        int[][] arr = new int[val][255];
        for (int i = 0; i < inputAString.size(); i++) {
            boolean verify = false;
            for (int j = 0; j < inputAString.get(i).length(); j++) {
                arr[i][inputAString.get(i).charAt(j)] += 1;
            }
            for (int j = 0; j < inputBString.get(i).length(); j++) {
                if (arr[i][inputBString.get(i).charAt(j)] != 0) {
                    verify = true;
                    break;
                }
            }
            if (verify) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
