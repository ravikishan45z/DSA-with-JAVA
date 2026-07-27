package Heap_DataStructure;
import java.util.Collections;
import java.util.PriorityQueue;

public class heapCollection {
    public static void main(String[] args) {
        //! Min Heap.
        /*  Time Cmplexity
        Inserting 1 element ===> T.C. ==> O(logn)
        Inserting n element ===> T.C. ==> O(n * logn)

        Deletating 1 element == T.C. == > O(logn)
        Deletation n element == T.C. == > O(n * logn)

        For minimum element == T.C. ==> O(1);
        */
        PriorityQueue<Integer> pq = new PriorityQueue<>();   
        pq.add(14984);
        pq.add(4141);
        pq.add(624);
        pq.add(22320);
        pq.add(16);
        pq.add(14);
        pq.add(-2);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq);
        for(int x : pq){
            System.out.print(x + " ");
        }
        System.out.println();

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(144);
        pq2.add(41);
        pq2.add(64);
        pq2.add(320);
        pq2.add(160);
        pq2.add(14);
        System.out.println(pq2.peek());
        System.out.println(pq2.size());
        System.out.println(pq2.remove());
        System.out.println(pq2);
        for (int x : pq) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
}