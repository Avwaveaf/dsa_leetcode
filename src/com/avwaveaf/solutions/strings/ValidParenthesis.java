package com.avwaveaf.solutions.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean sol1(String s){
//
//        Stack<Character> stack = new Stack<>();
//
//        for (char c : s.toCharArray()) {
//            if (c == '(' || c == '[' || c == '{') {
//                stack.push(c); // Push opening parentheses onto the stack
//            } else if (c == ')' || c == ']' || c == '}') {
//                if (stack.isEmpty()) {
//                    return false; // Closing parenthesis without a matching opening parenthesis
//                }
//                char top = stack.pop();
//                if ((c == ')' && top != '(') ||
//                        (c == ']' && top != '[') ||
//                        (c == '}' && top != '{')) {
//                    return false; // Mismatched parentheses
//                }
//            }
//        }
//
//        return stack.isEmpty();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
