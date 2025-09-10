package Resources;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Heap {

    protected Edge[] heap = {};
    protected String order = "min";

    public Heap(String order){
        if(order != null && (order.equals("min") || order.equals("max"))){
            this.order = order;
        }
    }

    public void insert(Edge edge) {
        Edge[] newHeap = Arrays.copyOf(heap, heap.length + 1);
        newHeap[newHeap.length - 1] = edge;
        heap = newHeap;
        bubbleUp(heap.length - 1);
    }

    public Edge extract() {
        if (heap.length == 0) {
            throw new NoSuchElementException("Heap is empty");
        }

        Edge minEdge = heap[0];

        heap[0] = heap[heap.length - 1];
        heap = Arrays.copyOf(heap, heap.length - 1);

        if (heap.length > 0) {
            bubbleDown(0);
        }

        return minEdge;
    }

    private void bubbleUp(int i) {
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (compare(heap[i], heap[parent])) {
                swap(i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }

    private void bubbleDown(int i) {
        int target = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heap.length && compare(heap[left], heap[target])) {
            target = left;
        }
        if (right < heap.length && compare(heap[right], heap[target])) {
            target = right;
        }

        if (target != i) {
            swap(i, target);
            bubbleDown(target);
        }
    }

    private void swap(int i, int j) {
        Edge temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }


    private boolean compare(Edge a, Edge b){

        if(order.equals("min")){
            return a.getCost() < b.getCost();
        } else {
            return a.getCost() > b.getCost();
        }

    }
}
