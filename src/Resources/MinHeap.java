package Resources;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MinHeap {

    protected Edge[] heap = {};

    public MinHeap(){}

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
            int superiorIndex = (i - 1) / 2;
            if (heap[i].getCost() < heap[superiorIndex].getCost()) {
                swap(i, superiorIndex);
                i = superiorIndex;
            } else {
                break;
            }
        }
    }

    private void bubbleDown(int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < heap.length && heap[left].getCost() < heap[smallest].getCost()) {
            smallest = left;
        }
        if (right < heap.length && heap[right].getCost() < heap[smallest].getCost()) {
            smallest = right;
        }

        if (smallest != i) {
            swap(i, smallest);
            bubbleDown(smallest);
        }
    }

    private void swap(int i, int j) {
        Edge temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
