package com.ang;

import java.util.*;

public class LeetCode_2289 {

    public static void main(String[] args) {
        int nums[] = {5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11};

        totalSteps(nums);
    }

    public static int totalSteps(int[] nums) {
        int result = 0;
        List<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        while (result < nums.length * nums.length) {
            Iterator iterator = list.iterator();
            int size = list.size();
            int it = nums[0];
            while (iterator.hasNext()) {
                int a = (int) iterator.next();
                if (it > a) {
                    iterator.remove();
                }
                it = a;
            }
            if (size == list.size()) {
                return result;
            }
            result++;
        }
        return result;
    }
}
