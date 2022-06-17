package com.ang.stack;

import java.util.*;

//150. 逆波兰表达式求值
public class LeetCode_150 {

    public static void main(String[] args) {
        String s1[] = new String[]{"2", "1", "+", "3", "*"};
        String s2[] = new String[]{"4", "13", "5", "/", "+"};
        String s3[] = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
//        evalRPN(s2);

//        try {
//            String s = null;
//            s.length();
//            System.out.println("错误后打印！");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> set = new HashSet<String>() {{
            add("+");
            add("-");
            add("*");
            add("/");
        }};
        int num = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (!set.contains(tokens[i])) {
                stack.add(Integer.valueOf(tokens[i]));
            } else {
                int x1 = stack.pop();
                int y1 = stack.pop();
                switch (tokens[i]) {
                    case "+":
                        num = y1+ x1 ;
                        stack.push(num);
                        break;
                    case "-":
                        num = y1 - x1;
                        stack.push(num);
                        break;
                    case "*":
                        num = y1 * x1;
                        stack.push(num);
                        break;
                    case "/":
                        num = y1 / x1;
                        stack.push(num);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
