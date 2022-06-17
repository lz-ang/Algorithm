package com.ang.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//32. 最长有效括号
public class LeetCode_32 {

    public int longestValidParentheses(String s) {
        int length = s.length();
//        Stack<Integer> stack = new Stack<>();
       // Queue<Integer> queue = new LinkedList<>();是队列，不是栈所以要和Deque
        Deque<Integer> deque = new LinkedList<>();
        int d = 0;
        deque.push(-1);
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if ('(' == c) {
                deque.push(i);
            }else {
                deque.pop();
                if (deque.isEmpty()) {
                    deque.add(i);
                }else {
                    d = Math.max(d, i - deque.peek());
                }
            }
        }
        return d;
    }
}
