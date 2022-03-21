package com.ang;

import java.util.*;

public class Test {

    public static int subsetXORSum(int[] nums) {
        int n = 1 << nums.length;//n表示总共子集的个数，且每个n的二进制代表nums数组元素下标的是否被选中，选中是用1表示补选中用0表示，例如 nums = {5,6,3},n=3的二进制表示011表示数组nums中6和3元素组成的自己，n和二进制位相同;
        int result = 0;
        for (int i = 0; i < n; i++) {
            int xor = 1;
            for (int j = 0; j < nums.length; j++) {
                if ((i >> j & 1) == 1) {
                    xor ^= nums[j];
                }
            }
            result += xor;
        }
        return result;
    }

    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        char cArr[] = s.toCharArray();
        int flag = -1;
        int i = 0;
        for (char c : cArr) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder builder : rows) {
            result.append(builder);
        }
        return result.toString();
    }

    public String convert2(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> rows = new ArrayList<StringBuilder>();
        for (int i = 0; i < numRows; i++) rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) res.append(row);
        return res.toString();
    }



    public static int countMaxOrSubsets(int[] nums) {
        int maxOr = 0, cnt = 0;
        for (int i = 0; i < 1 << nums.length; i++) {
            int orVal = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((i >> j) & 1) == 1) {
                    orVal |= nums[j];
                }
            }
            if (orVal > maxOr) {
                maxOr = orVal;
                cnt = 1;
            } else if (orVal == maxOr) {
                cnt++;
            }
        }
        return cnt;
    }


    public static int countMaxOrSubsets2(int[] nums) {
        int max =0;
        int count = 0;

        for (int i = 0; i < 1<< nums.length; i++) {
            int vo = 0;
            for (int j = 0; j < nums.length; j++) {
                if (((i << j) & 1) == 1) {
                    vo |= nums[j];
                }
            }

            if (vo > max) {
                max = vo;
                count = 1;
            } else if (vo == max) {
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array2 = {2,4,4};
        System.out.println(subsetXORSum(array2));
        longestWord(new String[]{"m","mo","moc","moch","mocha","l","la","lat","latt","latte","c","ca","cat"});
        countMaxOrSubsets2(array);
        System.out.println(1 << 3);
        String key_key = "3_4_";
        System.out.println(key_key.substring(0, key_key.length() - 1));
        String cmd = "ef110B00000500000a000000005A4Ffe";
        String rfidData = cmd.substring(3, 7);
        System.out.println(rfidData);
    }

    public static String longestWord(String[] words) {
        int length = words.length;
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }else {
                    return o2.compareTo(o1);
                }
            }
        });

        String result = "";
        Set<String> set = new HashSet<>();
        set.add("");

        for (int i = 0; i < length; i++) {
            if (set.contains(words[i].substring(0, words[i].length() - 1))) {
                set.add(words[i]);
                result = words[i];
            }
        }
        return result;
    }
}
