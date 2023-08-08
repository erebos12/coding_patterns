package heaps;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestMaxHeap {

    @Test
    public void main() {
        int[] heapArray = {1, 4, 7, 12, 15, 14, 9, 2, 3, 16};

        System.out.println("Before heapify: " + Arrays.toString(heapArray));
        new MaxHeap().buildMaxHeap(heapArray, heapArray.length);
        System.out.println("After heapify: " + Arrays.toString(heapArray));
    }
}
