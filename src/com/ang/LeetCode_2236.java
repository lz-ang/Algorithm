package com.ang;

public class LeetCode_2236 {
    public boolean checkTree(LeetCode_654.TreeNode root) {

        return root.val == root.left.val + root.right.val;
    }
}
