import merge_intervals.Interval;
import org.junit.jupiter.api.Test;

import static merge_intervals.MergeIntervals.mergeIntervals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TestMergeIntervals {


    @Test
    void testMergeIntervals01() {
        Interval[] arr = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 9);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(4, 7);
        mergeIntervals(arr);
    }

    @Test
    void testMergeIntervals02() {
        Interval[] arr = new Interval[4];
        arr[0] = new Interval(6, 8);
        arr[1] = new Interval(1, 3);
        arr[2] = new Interval(2, 4);
        arr[3] = new Interval(5, 7);
        mergeIntervals(arr);
    }




}
