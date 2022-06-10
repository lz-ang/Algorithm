package com.ang.stack;

public class ListNode {

    public String val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(String val) {
        this.val = val;
    }

    public ListNode(String val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
