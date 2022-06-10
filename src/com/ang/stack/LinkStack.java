package com.ang.stack;


//链式栈，使用链表创建的栈被称为链式栈，使用数组构建的栈成为顺序栈
public class LinkStack {

    private ListNode head;
    private int count;

    public void push(String item) {//入栈
        ListNode cur = new ListNode(item);
        cur.next = head;
        head.next = cur;
        count++;
    }


    public String pop() {//出栈
        if (count == 0 || head == null) {
            return null;
        }
        ListNode cur = head;
        head = head.next;
        count--;
        return cur.val;
    }
}
