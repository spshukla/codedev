package dev.code.gfg;

/**
 * Created by shreeprakash on 12/14/15.
 */
public class MaximumSubArray {

    // Kadene Algorithm
    public static void approach1(int arr[]) {
        int len = arr.length;
        int max_so_far = 0;
        int max_end_here = 0;
        int curr_max = arr[0];
        for (int i = 0; i < len; i++) {
            max_end_here = max_end_here + arr[i];
            if (max_end_here > max_so_far) {
                max_so_far = max_end_here;
            } else if (arr[i] < 0) {
                curr_max = -Math.min(Math.abs(curr_max), Math.abs(arr[i]));
                max_end_here = 0;
            }
        }
        if (max_so_far == 0) {
            System.out.println("Maximum sum=" + curr_max);
        } else {
            System.out.println("Maximum sum=" + max_so_far);
        }
    }

    public static void main(String args[]) {
        int arr[] = {-21, 33, -4, 9, 2, -51, -5, -3, -78};
        approach1(arr);
    }
}
