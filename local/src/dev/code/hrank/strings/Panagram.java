package dev.code.hrank.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shreeprakash on 12/26/15.
 */
public class Panagram {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String baseString = "The quick brown fox jumps over the lazy dog";
        baseString = baseString.toLowerCase();
        int arr[] = new int[255];
        for (int i = 0; i < baseString.length(); i++) {
            if (arr[baseString.charAt(i)] == 0) {
                arr[baseString.charAt(i)] = 1;
            }
        }
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferRead.readLine();
        s = s.toLowerCase();
        String output = "pangram";
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)] -= 1;
        }
        for (int i = 0; i < 255; i++) {
            if (arr[i] > 0) {
                output = "not pangram";
                break;
            }
        }
        System.out.println(output);
    }
}
