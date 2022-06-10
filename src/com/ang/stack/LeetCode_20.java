package com.ang.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


//20. 有效的括号
public class LeetCode_20 {

    public boolean isValid2(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Map<Character, Character> pairs = new HashMap<Character,Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        return stack.empty();
    }

    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            switch (item) {
                case '(':
                    stack.push('(');
                    break;
                case '[':
                    stack.push('[');
                    break;
                case '{':
                    stack.push('{');
                    break;

                case ')':
                    if (stack.empty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.empty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.empty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
            }
        }
        return stack.empty();
    }

}
