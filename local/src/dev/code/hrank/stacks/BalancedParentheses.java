package dev.code.hrank.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by shreeprakash on 1/12/16.
 */
public class BalancedParentheses {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());
        String str[] = new String[num];
        for (int i = 0; i < num; i++) {
            str[i] = scanner.nextLine();
        }
        for (int i = 0; i < num; i++) {
            String verify = "NO";
            Stack<String> strings = new Stack<>();
            for (int j = 0; j < str[i].length(); j++) {
                if ((str[i].charAt(j) == '{') || (str[i].charAt(j) == '[') || (str[i].charAt(j) == '(')) {
                    strings.add(str[i].charAt(j) + "");
                } else {
                    if (strings.size() == 0) {
                        verify = "NO";
                        break;
                    }
                    String value = strings.pop();
                    if (str[i].charAt(j) == '}' && value.equals("{")) {
                        verify = "YES";
                    } else if (str[i].charAt(j) == ']' && value.equals("[")) {
                        verify = "YES";
                    } else if (str[i].charAt(j) == ')' && value.equals("(")) {
                        verify = "YES";
                    } else {
                        verify = "NO";
                        break;
                    }
                }
            }
            if (strings.size() > 0) {
                verify = "NO";
            }
            System.out.println(verify);
        }
    }
}
