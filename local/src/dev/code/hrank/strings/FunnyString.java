package dev.code.hrank.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by shreeprakash on 12/26/15.
 */
public class FunnyString {
    public static void main(String args[]) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int val = Integer.valueOf(s);
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < val; i++) {
            s = bufferedReader.readLine();
            strings.add(s);
        }

        for (String str : strings) {
            String outcome = "Funny";
            for (int i = 0; i < str.length() - 1; i++) {
                int len = str.length() - 1;
                int diffInOriginalStr = Math.abs(str.charAt(i) - str.charAt(i + 1));
                int diffInReverseStr = Math.abs(str.charAt(len - i) - str.charAt(len - i - 1));
                if (!(diffInOriginalStr == diffInReverseStr)) {
                    outcome = "Not Funny";
                }
            }
            System.out.println(outcome);
        }
    }
}
