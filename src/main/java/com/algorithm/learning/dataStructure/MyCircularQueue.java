package com.algorithm.learning.dataStructure;

import lombok.Data;

import java.util.Arrays;

@Data
public class MyCircularQueue {

    private Integer[] queue;

    private Integer head ;

    private Integer tail;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue = new Integer[k];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            head = 0;
            tail = 0;
            queue[head] = value;
            return true;
        }
        tail = increaseIndex(tail);
        queue[tail] = value;
        return true;
    }

    private int increaseIndex(int index) {
        if (index == queue.length - 1) {

            index = 0;
        } else {
            index++;
        }
        return index;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        queue[head] = null;
        if (tail.equals(head)) {
            tail = null;
            head = null;
        } else {
            head = increaseIndex(head);
        }
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[tail];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if (head == null && tail == null) {
            return true;
        }
        return false;
    }


    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if (head == null && tail == null) {
            return false;
        }
        int prepareTail = increaseIndex(tail);

        if (prepareTail == head) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "MyCircularQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", head=" + head +
                ", tail=" + tail +
                '}';
    }

    /**
     * Your MyCircularQueue object will be instantiated and called as such:
     * MyCircularQueue obj = new MyCircularQueue(k);
     * boolean param_1 = obj.enQueue(value);
     * boolean param_2 = obj.deQueue();
     * int param_3 = obj.Front();
     * int param_4 = obj.Rear();
     * boolean param_5 = obj.isEmpty();
     * boolean param_6 = obj.isFull();
     */

    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(6);
        circularQueue.enQueue(6);
        circularQueue.Rear();
        circularQueue.Rear();
        circularQueue.deQueue();
        circularQueue.enQueue(5);
        circularQueue.Rear();
        circularQueue.deQueue();
        circularQueue.Front();
        circularQueue.deQueue();
        circularQueue.deQueue();
        circularQueue.deQueue();

    }
}
