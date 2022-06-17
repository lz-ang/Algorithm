package com.ang.queue;

import javax.management.Query;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LeetCode_641 {


    class MyCircularDeque {
        int length = 0;
        int k = 0;
        Deque<Integer> deque;

        public MyCircularDeque(int k) {
            this.k = k;
            deque = new ArrayDeque<Integer>(k);
        }

        public boolean insertFront(int value) {
            if (deque.size() < k) {
                deque.addFirst(value);
                return true;
            }
            return false;
        }

        public boolean insertLast(int value) {
            if (deque.size() < k) {
                deque.addLast(value);
                return true;
            }
            return false;
        }

        public boolean deleteFront() {
            if (deque.isEmpty()) {
                return false;
            }else {
                deque.removeFirst();
                return true;
            }
        }

        public boolean deleteLast() {
            if (deque.isEmpty()) {
                return false;
            }else {
                deque.removeLast();
                return true;
            }
        }

        public int getFront() {
            return deque.isEmpty() ? -1 : deque.getFirst();
        }

        public int getRear() {
            return deque.isEmpty() ? -1 : deque.getLast();
        }

        public boolean isEmpty() {
           return deque.isEmpty();
        }

        public boolean isFull() {
            return deque.size() == k;
        }
    }
}
