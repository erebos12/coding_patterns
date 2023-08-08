package heaps;

import static heaps.MinHeap.buildMinHeap;

public class FindKSmallest {
//1. Build minHeap of the given array.
//2. Extract the minimum element/root and add it to the result
//3. Keep removing elements and repeatedly build minHeap till we reach K.

    public static int[] findKSmallest(int[] arr, int k) {
        int arraySize = arr.length;
        if (k <= arraySize) {
            int[] result = new int[k];
            for (int i = 0; i < k; i++) {
                result[i] = removeMin(arr, arraySize);
                --arraySize;
            }
            return result;
        }
        return arr;
    }

    private static int removeMin(int[] heapArray, int heapSize) {
        buildMinHeap(heapArray, heapSize);
        int min = heapArray[0];
        heapArray[0] = heapArray[heapSize - 1];
        return min;
    }
}

