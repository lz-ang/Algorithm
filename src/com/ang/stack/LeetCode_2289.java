package com.ang.stack;

import java.util.*;

public class LeetCode_2289 {

    public static void main(String[] args) {
        int nums[] = {5, 3, 4, 4, 7, 3, 6, 11, 8, 5, 11};

        totalSteps(nums);
    }

    public static int totalSteps(int[] nums) {
//        int result = 0;
//        List<Integer> list = new ArrayList<>(nums.length);
//        for (int i = 0; i < nums.length; i++) {
//            list.add(nums[i]);
//        }
//        while (result < nums.length) {
//            Iterator iterator = list.iterator();
//            int size = list.size();
//            int it = nums[0];
//            while (iterator.hasNext()) {
//                int a = (int) iterator.next();
//                if (it > a) {
//                    iterator.remove();
//                }
//                it = a;
//            }
//            if (size == list.size()) {
//                return result;
//            }
//            result++;
//        }
//        return result;

        //官方中找到的答案
        int ans = 0;
        Deque<int[]> st = new ArrayDeque<int[]>();
        for (int num : nums) {
            int maxT = 0;
            while (!st.isEmpty() && st.peek()[0] <= num)
                maxT = Math.max(maxT, st.pop()[1]);
            maxT = st.isEmpty() ? 0 : maxT + 1;
            ans = Math.max(ans, maxT);
            st.push(new int[]{num, maxT});
        }
        return ans;
    }
}
