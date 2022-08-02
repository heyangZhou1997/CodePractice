public class Problem_LeetCode622 {
    public static void main(String[] args) {
        MyCircularQueue_LeetCode622 circularQueue = new MyCircularQueue_LeetCode622(3);
        System.out.println(circularQueue.enQueue(1));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
        System.out.println( circularQueue.isFull());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
    }
}

class MyCircularQueue_LeetCode622 {

    private int[] queue;

    private int head;

    private int tail;

    private int len;

    public MyCircularQueue_LeetCode622(int k) {
        len = k + 1;
        queue = new int[len];
        head = 0;
        tail = 0;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        queue[tail] = value;
        tail = (tail + 1) % len;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head + 1) % len;
        return true;

    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return queue[head];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return queue[(tail - 1 + len) % len] ;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public boolean isFull() {
        return (tail + 1) % len == head;
    }
}