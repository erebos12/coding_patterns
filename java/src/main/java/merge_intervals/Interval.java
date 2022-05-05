package merge_intervals;


public class Interval {
    int start, end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void print() {
        System.out.println("start: " + start + " end: " + end);
    }
}