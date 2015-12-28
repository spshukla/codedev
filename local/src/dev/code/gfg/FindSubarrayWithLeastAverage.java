package dev.code.gfg;

/**
 * Created by shreeprakash on 12/16/15.
 */
public class FindSubarrayWithLeastAverage {
    public static void main(String args[]) {
        int arr[] = {3, 7, 90, 20, 10, 50, 40};
        int k = 3;
        findSubArray(arr, k);
        findSubArrayUsingSlidingWindow(arr, k);
    }


    public static void findSubArrayUsingSlidingWindow(int arr[], int k) {
        float avgSum = 0;
        float min_avgSum = Float.MAX_VALUE;
        int count = 0;
        if (k > arr.length) {
            System.out.println("Indices size greater than int array");
            return;
        }
        if (k == arr.length) {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
            System.out.println("Minimum Average Sum=" + sum / k);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (count >= k) {
                if ((avgSum / k) < min_avgSum) {
                    min_avgSum = avgSum / k;
                }
                avgSum = avgSum - arr[((count) - k)];
                avgSum = avgSum + arr[count];
                count++;
            } else {
                count++;
                avgSum += arr[i];
            }
        }
        System.out.println("Minimum Average Sum=" + min_avgSum);

    }

    public static void findSubArray(int arr[], int k) {
        int start_index = 0;
        int end_index = arr.length;
        if (k > arr.length) {
            System.out.println("Indices size greater than int array");
            System.out.println("Start : End Index=" + start_index + ":" + end_index);
            return;
        }
        if (k == arr.length) {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
            System.out.println("Minimum Average Sum=" + sum / k);
            System.out.println("Start : End Index=" + start_index + ":" + end_index);
            return;
        }
        float min_avgSum = Float.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            float avgSum = 0;
            int count = 0;
            for (int j = i; (count < k) && (j < arr.length); j++, count++) {
                avgSum += arr[j];
            }
            if (count == k) {
                if ((avgSum / k) < min_avgSum) {
                    min_avgSum = avgSum / k;
                    start_index = i;
                    end_index = i + k - 1;
                }
            }
        }
        System.out.println("Minimum Average Sum=" + min_avgSum);
        System.out.println("Start : End Index=" + start_index + ":" + end_index);
    }
}
