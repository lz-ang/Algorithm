package com.ang;

//654. 最大二叉树
public class LeetCode_654 {


    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return com(nums, 0, nums.length);
    }


    private TreeNode com(int[] nums, int l, int r) {
        if (l == r) {
            return null;
        }
        int index = max(nums, l, r);
        TreeNode root = new TreeNode(nums[index]);
        root.left = com(nums, l, index);
        root.right = com(nums, index + 1, r);
        return root;
    }

    private int max(int[] nums, int l, int r) {//求最大值的index
        int index = l;
        for (int i = l; i < r; i++) {
            if (nums[i] > nums[index]) {
                index = i;
            }
        }
        return index;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
