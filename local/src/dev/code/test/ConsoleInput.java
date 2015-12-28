package dev.code.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by shreeprakash on 12/17/15.
 */
public class ConsoleInput {
    public static void main(String args[]) {
        System.out.println("Input something");
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        try {
            boolean exit = true;
            while (exit) {
                if ("42".equalsIgnoreCase(bufferRead.readLine())) {
                    exit = false;
                } else {
                    System.out.println(bufferRead.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
