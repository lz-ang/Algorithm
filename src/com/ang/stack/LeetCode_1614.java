package com.ang.stack;

import java.util.Stack;

//1614. 括号的最大嵌套深度
public class LeetCode_1614 {

    public int maxDepth(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if ('(' == item) {
                stack.push(1);
                Integer size = stack.size();
                num = Math.max(size, num);
            } else if (')'==item) {
                // if (stack.size() == 0) {//不做")(" 错误判断
                //     return 0;
                // }
                stack.pop();
            }
        }
        // if (stack.size() != 0) {//注释后不做"(()"错误判断
        //     return 0;
        // }
        return num;

        // Stack<String> stack = new Stack<>();
        // int num =0;
        // for (int i = 0; i < s.length(); i++) {
        //     String item = s.substring(i, i+1);
        //     if ("(".equals(item)) {
        //         stack.push(item);
        //         if(stack.size()>num){
        //             num = stack.size();
        //         }
        //     } else if (")".equals(item)) {
        //         if(stack.size()==0){
        //             return 0;
        //         }
        //         stack.pop();
        //     }
        // }
        // if(stack.size() !=0){
        //     return 0;
        // }
        // return num;
    }
}
