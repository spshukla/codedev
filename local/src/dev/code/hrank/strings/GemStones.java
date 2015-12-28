package dev.code.hrank.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;

/**
 * Created by shreeprakash on 12/26/15.
 */
public class GemStones {
    public static void main(String args[]) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.valueOf(bufferedReader.readLine());
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < val; i++) {
            strings.add(bufferedReader.readLine());
        }
        ArrayList<BitSet> bitSets = new ArrayList<>();
        for (String str : strings) {
            BitSet bitSet = new BitSet(255);
            for (int i = 0; i < str.length(); i++) {
                bitSet.set(str.charAt(i));
            }
            bitSets.add(bitSet);
        }

        BitSet bitSet = bitSets.get(0);
        for (BitSet bitSet1 : bitSets) {
            bitSet.and(bitSet1);
        }

        int count = 0;
        for (int i = 0; i < bitSet.size(); i++) {
            if (bitSet.get(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
