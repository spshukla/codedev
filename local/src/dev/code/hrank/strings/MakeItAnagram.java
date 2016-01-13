package dev.code.hrank.strings;

import java.util.Scanner;

/**
 * Created by shreeprakash on 1/8/16.
 */
public class MakeItAnagram {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String numToBeSearched = scanner.nextLine();

        String numOfElements = scanner.nextLine();

        String numbers1 = scanner.nextLine();
        int num2 = Integer.valueOf(numToBeSearched);
        String num[] = numbers1.split(" ");
        for(int i=0;i<Integer.valueOf(numOfElements);i++) {
            int temp = Integer.valueOf(num[i]);
            if(temp == num2) {
                System.out.println(i);
            }
        }
    }
}
