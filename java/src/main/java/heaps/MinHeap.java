package heaps;

public class MinHeap {

    public static void buildMinHeap(int[] heapArray, int heapSize) {

        // swap largest child to parent node
        for (int i = (heapSize - 1) / 2; i >= 0; i--) {
            minHeapify(heapArray, i, heapSize);
        }
    }

    private static void minHeapify(int[] heapArray, int index, int heapSize) {
        int smallest = index;
        while (smallest < heapSize / 2) { // check parent nodes only
            int left = (2 * index) + 1; //left child
            int right = (2 * index) + 2; //right child
            if (left < heapSize && heapArray[left] < heapArray[index]) {
                smallest = left;
            }
            if (right < heapSize && heapArray[right] < heapArray[smallest]) {
                smallest = right;
            }
            if (smallest != index) { // swap parent with smallest child
                int temp = heapArray[index];
                heapArray[index] = heapArray[smallest];
                heapArray[smallest] = temp;
                index = smallest;
            } else {
                break; // if heap property is satisfied
            }
        }
    }
}
