package task04;

import java.util.Scanner;
import java.util.Stack;

public class BalanceBraces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Expression in [[{}]] pattern");
        String str = sc.nextLine();
        if (isBalaceParanthesis(str)) {
            System.out.println("Expression is balanced");
        } else System.out.println("Expression is not balanced");

        sc.close();
    }

    public static boolean isBalaceParanthesis(String str) {
        if (str.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            }
            if (c == '}' || c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                Character top = stack.pop();

                if ((top == '(' && c != ')') || (top == '{' && c != '}')
                        || (top == '[' && c != ']')) {
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }


}

