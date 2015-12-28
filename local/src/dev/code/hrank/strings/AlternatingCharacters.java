package dev.code.hrank.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by shreeprakash on 12/26/15.
 */
public class AlternatingCharacters {
    public static void main(String args[]) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.valueOf(bufferedReader.readLine());
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (int i = 0; i < val; i++) {
            stringArrayList.add(bufferedReader.readLine());
        }


        for (String str : stringArrayList) {
            int numOfDeletions = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    numOfDeletions++;
                }
            }
            System.out.println(numOfDeletions);
        }


    }
}
