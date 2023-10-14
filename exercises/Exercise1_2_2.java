package exercises;

import edu.princeton.cs.algs4.*;

import java.awt.*;

public class Exercise1_2_2 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[N];
        for (int t = 0; t < N; t++) {
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            Interval1D interval = new Interval1D(x, y);
            intervals[t] = interval;
        }

        for (int t0 = 0; t0 < N; t0++) {
            StdOut.print(t0 + ") ");
            boolean isFirstIntersect = true;
            for (int t1 = 0; t1 < N; t1++) {
                if (t0 != t1 && intervals[t0].intersects(intervals[t1])) {
                    if (isFirstIntersect) {
                        StdOut.print(intervals[t0] + " ");
                        isFirstIntersect = false;
                    }
                    StdOut.print(intervals[t1]  + " ");
                }
            }
            if (t0 != N - 1) {
                StdOut.println();
            }
        }
    }
}
