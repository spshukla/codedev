package dev.code.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by shreeprakash on 8/23/15.
 */
public class StringPermutation {

    /// Approach-1 (Starts)
    private static List<String> permuteList = new ArrayList<>();

    public static void swap(char a[], int firstIndex, int secondIndex) {
        char temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }

    public static void permute(char a[], int startIndex, int endIndex) {
        if (startIndex == endIndex) {
            permuteList.add(String.valueOf(a));
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                swap(a, startIndex, i);
                permute(a, startIndex + 1, endIndex);
                swap(a, startIndex, i);
            }
        }
    }
    /// Approach-1 (Ends)

    public static void main(String args[]) {
        String abc = "VIEW";
        char arr[] = abc.toCharArray();
        Arrays.sort(arr);
        int len = arr.length - 1;
        permute(arr, 0, len);
        Collections.sort(permuteList);
        for (int i = 0; i < permuteList.size(); i++) {
            if (abc.equalsIgnoreCase(permuteList.get(i))) {
                System.out.println("Found at position:" + (i + 1));
            }
        }
    }
}
