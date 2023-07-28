package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TwoHeapsCapitalProblem {

    public static int maximumCapital(int c, int k, int[] capitals, int[] profits) {
        int currentCapital = c;
        PriorityQueue<int[]> capitalMinHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        for (int i = 0; i < capitals.length; ++i) {
            capitalMinHeap.offer(new int[] {capitals[i], i});
        }
        PriorityQueue<int[]> profitsMaxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int i = 0;
        while (i < k) {
            while (!capitalMinHeap.isEmpty() && capitalMinHeap.peek()[0] <= currentCapital) {
                int[] j = capitalMinHeap.poll();
                profitsMaxHeap.offer(new int[]{profits[j[1]], j[1]});
            }
            if (profitsMaxHeap.isEmpty()) {
                break;
            }
            int x = profitsMaxHeap.poll()[0];
            currentCapital += x;
            i++;
        }
        return currentCapital;
    }
}
