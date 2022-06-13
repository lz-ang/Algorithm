package com.ang;

public class MinPartition_1689 {
//    public static void main(String[] args) {
//        String s = "32";
//        minPartitions(s);
//    }

    public static int minPartitions(String n) {
        char[] num = n.toCharArray();
        int max = num[0]-'0';
        for (int i = 0; i < num.length; i++) {
            if (num[i]-'0' > max) {
                max = num[i]-'0';
            }
        }
        return max;
    }
}
