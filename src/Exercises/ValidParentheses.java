package Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(())"));
        System.out.println(isValid("((())"));
        System.out.println(isValid("((){)"));
        System.out.println(isValid("({()})"));
        System.out.println(isValid("([])"));
        System.out.println(isValid("([]{}})"));
        System.out.println(isValid("([]{{}})"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.add(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else if (ch == ')') {
                Character stackChar = stack.pop();
                if (stackChar == null || stackChar != '(') return false;
            } else if (ch == '}') {
                Character stackChar = stack.pop();
                if (stackChar == null || stackChar != '{') return false;
            } else if (ch == ']') {
                Character stackChar = stack.pop();
                if (stackChar == null || stackChar != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
