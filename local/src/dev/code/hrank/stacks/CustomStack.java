package dev.code.hrank.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by shreeprakash on 1/13/16.
 */
public class CustomStack {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        List<Integer> output = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> sortedStack = new Stack<>();
        for (int i = 0; i < num; i++) {
            String str = scanner.nextLine();
            String split[] = str.split(" ");
            if (split.length > 1) {
                int val = Integer.valueOf(split[1]);
                stack.add(val);
                if (sortedStack.size() > 0) {
                    if (sortedStack.get(sortedStack.size() - 1) > val) {

                        for (int curr = sortedStack.size() - 1; curr >= 0; curr--) {
                            if (val > sortedStack.get(curr)) {
                                int temp = sortedStack.get(curr);
                                sortedStack.add(sortedStack.size() - 1, val);
                                sortedStack.add(sortedStack.size(), temp);
                            }
                        }

                    } else {
                        sortedStack.add(val);
                    }
                } else {
                    sortedStack.add(val);
                }
            } else {
                if (Integer.valueOf(str) == 2) {
                    if (stack.size() > 0) {
                        int temp = stack.pop();
                        sortedStack.remove(new Integer(temp));
                    }
                } else if (Integer.valueOf(str) == 3) {
                    if (sortedStack.size() > 0) {

                        output.add(sortedStack.get(sortedStack.size() - 1));
                    }
                }
            }
        }
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
