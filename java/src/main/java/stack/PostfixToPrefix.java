package stack;

import java.util.Stack;

import static stack.Helper.isOperator;

public class PostfixToPrefix {
    public static String convert(String postfix) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (isOperator(c)) {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String s = c + op2 + op1;
                stack.push(s);
            } else {
                stack.push(String.valueOf(c));
            }
        }
        return stack.pop();
    }
}
