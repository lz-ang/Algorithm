package com.ang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_interview0403 {

//    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(1);
//        treeNode.left = new TreeNode(2);
//        treeNode.right = new TreeNode(3);
//
//        listOfDepth(treeNode);
//    }

    public static ListNode[] listOfDepth(TreeNode tree) {

        LinkedList<TreeNode> linkedList = new LinkedList<>();//利用LinkedList遍历二叉树每层的数据
        linkedList.add(tree);

        List<List<Integer>> list1 = new ArrayList<>();

        while (!linkedList.isEmpty()) {
            List<Integer> list2 = new ArrayList<>();
            for (int i = linkedList.size(); i > 0; i--) {
                TreeNode treeNode = linkedList.poll();
                list2.add(treeNode.val);
                if (treeNode.left != null) {
                    linkedList.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    linkedList.add(treeNode.right);
                }
            }
            list1.add(list2);
        }

        ListNode[] listNodes = new ListNode[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            ListNode node = new ListNode(0);
            ListNode cur = node;
            for (int j = 0; j < list1.get(i).size(); j++) {
                cur.next = new ListNode(list1.get(i).get(j));
                cur = cur.next;
            }
            listNodes[i] = node.next;
        }
        return listNodes;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
