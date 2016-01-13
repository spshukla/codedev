package dev.code.java;

/**
 * Created by shreeprakash on 1/12/16.
 */
public class Fibonacci {
    static int arr[] = new int[20];

    public static void main(String args[]) {
        int num = 5;
        System.out.println(fib(8));
    }


    public static int fib(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else if (arr[num] != 0) {
            return arr[num];
        } else {
            int r = fib(num - 2) + fib(num - 1);
            arr[num] = r;
            return r;
        }
    }
}
