package QueuesInJAVA;

import java.util.*;


public class traversalinQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        // int n = q.size();
        // for (int i = 0; i < n; i++) {
        //     int val = q.remove();
        //     System.out.println(val + " ");
        //     q.add(val);
        // }
        // System.out.println("Peek : " + q.peek());

        // System.out.println(q);
        display(q);
        q = insertAtindex(3, 60, q);
        display(q);
        // System.out.println(q);
        System.out.println(valueAtIndex(3,q));
        display(q);
        // System.out.println(q);
    }

    public static Queue<Integer> insertAtindex(int index, int value, Queue<Integer> q) {
        int n = q.size();
        if (index < 0 || index > n) {
            System.out.print("Index is invalid");
            return q;
        }

        if(index == n){
            q.add(value);
            return q;
        }

        for (int i = 0; i < index; i++) {
            int ele = q.remove();
            q.add(ele);
        }
        q.add(value);
        for (int i = 0; i < n - index; i++) {
            int val = q.remove();
            q.add(val);
        }

        return q;
    }
    
    public static int valueAtIndex(int index, Queue<Integer> q ){
        int n = q.size();

        if(index < 0 || index > n){
            return -1;
        }
        for(int i = 0; i<index; i++){
            int val = q.remove();
            q.add(val);
        }
        int value = q.peek();
        for(int i = 0; i<n-index; i++){
            int val = q.remove();
            q.add(val);
        }
        return value;
    }

    public static void display(Queue<Integer> q){
        int n = q.size();
        for(int i = 0; i<n; i++){
            int val = q.remove();
            System.out.print(val+" ");
            q.add(val);
        }
        System.out.println();
    }
}
