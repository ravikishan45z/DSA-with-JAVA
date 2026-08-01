package Heap_DataStructure;

class MaxHeap {
    private int[] arr;
    private int size = 0;

    MaxHeap(int capacity) {
        // Use one-based indexing, so allocate an extra slot.
        arr = new int[capacity + 1];
    }

    public void add(int ele) {
        if (size == arr.length - 1) {
            System.out.println("Heap is Full!");
            return;
        }
        size++;
        arr[size] = ele;

        int current = size;
        while (current > 1) {
            int parent = current / 2;
            if (arr[current] > arr[parent]) {
                int temp = arr[current];
                arr[current] = arr[parent];
                arr[parent] = temp;
                current = parent;
            } else {
                break;
            }
        }
    }

    public int remove() {
        if (size == 0) {
            System.out.println("Heap is Empty!");
            return -1;
        }

        int max = arr[1];
        arr[1] = arr[size];
        size--;

        int current = 1;
        while (true) {
            int left = current * 2;
            int right = current * 2 + 1;
            int largest = current;

            if (left <= size && arr[left] > arr[largest]) {
                largest = left;
            }
            if (right <= size && arr[right] > arr[largest]) {
                largest = right;
            }
            if (largest == current) {
                break;
            }

            int temp = arr[current];
            arr[current] = arr[largest];
            arr[largest] = temp;
            current = largest;
        }

        return max;
    }

    void display() {
        for (int i = 1; i <= size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return size;
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Heap is Empty!");
            return -1;
        }
        return arr[1];
    }
}

public class MaxHeapImplementation {
    public static void main(String[] args) {
        MaxHeap maxheap = new MaxHeap(5);
        maxheap.add(10);
        maxheap.add(4);
        maxheap.add(15);
        maxheap.add(20);
        maxheap.add(2);

        System.out.print("Heap elements: ");
        maxheap.display();
        System.out.println("Peek: " + maxheap.peek());
        System.out.println("Removed: " + maxheap.remove());
        System.out.print("After removal: ");
        maxheap.display();
    }
}
