package QueuesInJAVA;

import java.util.*;

public class basicsOFQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(32);
        q.add(22);
        q.add(89);
        q.add(12);
        q.add(782);
        q.add(532);
        System.out.println(q); // nakli printing
        q.remove();
        q.remove();
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.size());
    }
}
