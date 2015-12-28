package dev.code.gfg;

/**
 * Created by shreeprakash on 9/8/15.
 */
public class StringMatching {
    public static void main(String args[]) {
        String text = "AGGCTCATGCTGCAGTCATGCTTAGGCTAGCT";
        String pattern = "GCT";
        System.out.println("Number of occurrences=" + findNumberOfOccurencesI(text, pattern));
    }

    public static int findNumberOfOccurencesI(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
        if (patternLength > textLength) {
            return -1;
        }
        if (patternLength == textLength && text.equals(pattern)) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i <= textLength - patternLength; i++) {
            String sub = text.substring(i, i + 3);
            if (sub.equals(pattern)) {
                count++;
            }
        }
        return count;
    }
}
