package stack;

import java.util.Stack;

import static stack.Helper.isOperator;

public class PrefixToPostfix {
    public static String convert(String prefix) {
        Stack<String> stack = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String s = op1 + op2 + c;
                stack.push(s);
            } else {
                stack.push(String.valueOf(c));
            }
        }
        return stack.pop();
    }
}
