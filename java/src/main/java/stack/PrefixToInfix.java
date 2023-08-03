package stack;

import java.util.Stack;

public class PrefixToInfix {

    static boolean isOperator(char x) {
        return switch (x) {
            case '+', '-', '*', '/', '^', '%' -> true;
            default -> false;
        };
    }

    // Convert prefix to Infix expression
    public static String convert(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            } else {
                stack.push(String.valueOf(c));
            }
        }
        return stack.pop();
    }

}
