package com.ang.stack;

//1111. 有效括号的嵌套深度
public class LeetCode_1111 {

    public int[] maxDepthAfterSplit(String seq) {
        int length = seq.length();
        int d = 0;
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            char c = seq.charAt(i);
            if (c== '(') {
                nums[i] = d % 2;
                d++;
            } else {
                d--;
                nums[i] = d % 2;
            }
        }
        return nums;
    }
}
