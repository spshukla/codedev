package dev.code.ibit;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shreeprakash on 8/20/15.
 */
public class MaximumSubArray {
    public static void main(String args[]) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(756898537, -1973594324, -2038664370, -184803526, 1424268980));
        ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
        temp.add(new ArrayList<Integer>());
        int count = 0;
        int maxIndex = 0;
        long max_so_far = 0;
        long max_till_here = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 0) {
                max_till_here += a.get(i);
                temp.get(count).add(a.get(i));
            } else {
                temp.add(new ArrayList<Integer>());
                if (max_till_here > max_so_far) {
                    max_so_far = max_till_here;
                    maxIndex = count;
                }
                count++;
                max_till_here = 0;
            }
        }
        if (max_till_here != 0) {
            if (max_till_here > max_so_far) {
                maxIndex = count;
            }
        }
        for (int i = 0; i < temp.get(maxIndex).size(); i++) {
            System.out.print(temp.get(maxIndex).get(i) + " ");
        }
    }
}
