package QueuesInJAVA;

class CircularQueue {
    int[] arr;
    int f;
    int r;
    int size;

    CircularQueue(int len) {
        arr = new int[len];
        f = 0;
        r = -1;
        size = 0;
    }

    void add(int val) {
        if (size == arr.length) {
            System.out.println("Queue is Full!");
            return;
        }
        r = (r + 1) % arr.length;
        arr[r] = val;
        size++;
    }

    int remove() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int removedValue = arr[f];
        f = (f + 1) % arr.length;
        size--;
        return removedValue;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return arr[f];
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is Empty");
            return;
        }

        int i = f;
        for (int count = 0; count < size; count++) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % arr.length;
        }
        System.out.println();
    }
}

public class QueueIMPusingArray {
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
    }
}
