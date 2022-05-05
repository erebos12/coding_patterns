package merge_intervals;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

    public static void mergeIntervals(Interval[] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i.start));
        for (Interval in : intervals) {
            in.print();
        }
        int index = 0; // Stores index of last element
        for (int i = 1; i < intervals.length; i++) {
            // If this is not first Interval and overlaps
            // with the previous one
            if (intervals[index].end >= intervals[i].start) {
                // Merge previous and current Intervals
                intervals[index].end = Math.max(intervals[index].end, intervals[i].end);
                System.out.println("intervals[index].end: " + intervals[index].end);
            } else {
                index++;
                intervals[index] = intervals[i];
            }
        }
        // Now arr[0..index-1] stores the merged Intervals
        System.out.println("The Merged Intervals are: ");
        for (int i = 0; i <= index; i++) {
            System.out.println("[" + intervals[i].start + ","
                    + intervals[i].end + "]");
        }
    }
}