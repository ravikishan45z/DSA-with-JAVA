package Heap_DataStructure;

class Heap {
    private int[] arr;
    // int size = 0;
    private int index = 1;

    Heap(int capacity) {
        arr = new int[capacity];
    }

    public void add(int ele) {
        if (index == arr.length) {
            System.out.println("Heap is Full!");
            return;
        }
        arr[index++] = ele;
        // Rearrangement
        int root = index - 1;
        while (root != 1) {
            int parent = root / 2;
            if (arr[root] < arr[parent]) {
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            } else {
                break;
            }
        }
    }

    public int remove() {
        if (index == 1) {
            System.out.println("Heap is Empty!");
            return -1;
        }

        int min = arr[1];
        arr[1] = arr[index - 1];
        index--;

        // Rearrangement
        int root = 1;
        while (root <= size()) {
            int left = 2 * root;
            int right = 2 * root + 1;
            int leftVal = (left <= size()) ? arr[left] : Integer.MAX_VALUE;
            int rightVal = (right <= size()) ? arr[right] : Integer.MAX_VALUE;
            if(arr[root] < leftVal && arr[root] < rightVal){
                break;
            }else{
                if(leftVal < rightVal){
                    int temp = arr[root];
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left;
                } else {
                    int temp = arr[root];
                    arr[root] = arr[right];
                    arr[right] = temp;
                    root = right;
                }
            }
        }
        return min;
    }

    void display() {
        for (int i = 1; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return index - 1;
    }

    public int peek() {
        if(index == 1){
            System.out.println("Heap is Empty!");
            return -1;
        }
        return arr[1];
    }

}

public class MinHeapImplementation {
    public static void main(String[] args) {
        // root = i;
        // leftChild = 2*i;
        // rightchild = 2*i+1

        Heap h = new Heap(10);
        h.add(10);
        h.add(15);
        h.add(8);
        h.add(9);
        h.add(4);
        h.display();
        System.out.println(h.remove());
        h.display();
        h.add(2);
        h.display();
        System.out.println(h.remove());
        h.display();
    }
}