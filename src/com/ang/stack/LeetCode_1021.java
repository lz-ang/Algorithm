package com.ang.stack;

import java.util.*;

public class LeetCode_1021 {

    public static void main(String[] args) {
        String s = "(()())(())(()(()))";

        removeOuterParentheses(s);
    }

    public static String removeOuterParentheses2(String s) {
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int preIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else {
                stack.pop();
            }
            if (stack.isEmpty()) {
                String ss = s.substring(preIndex, i + 1);
                builder.append(ss, 1, ss.length() - 1);
                preIndex = i + 1;
            }
        }
        return builder.toString();
    }

    public static String removeOuterParentheses(String s) {
        if (s.isEmpty()) {
            return s;
        }
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put('(', ')');
        }};
        List<String> item = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        int preIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                stack.push(ch);
            } else {
                stack.pop();
            }
            if (stack.isEmpty()) {
                item.add(s.substring(preIndex, i + 1));
                preIndex = i + 1;
            }
        }
        StringBuilder builder = new StringBuilder();

        for (String ss : item) {
            if (ss.length() > 2) {
                builder.append(ss.substring(1, ss.length() - 1));
            }
        }
        return builder.toString();
    }
}
