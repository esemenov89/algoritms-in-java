package exercises;

import edu.princeton.cs.algs4.*;

import java.awt.*;

public class Exercise1_2_3 {

    public static void main(String[] args) {
        double xlo = 0;
        double xhi = .9;
        double ylo = 0;
        double yhi = .9;

        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);

        Interval1D xint = new Interval1D(xlo, xhi);
        Interval1D yint = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(xint, yint);
        box.draw();

        Interval2D[] intervals = new Interval2D[N];
        double[][] pointsFromInterval = new double[N][4];

        for (int t = 0; t < N; t++) {
            double x1 = xlo + Math.random() * (xhi - max);
            double x2 = x1 + min + Math.random() * (max - min);
            Interval1D interval1 = new Interval1D(x1, x2);

            double y1 = ylo + Math.random() * (yhi - max);
            double y2 = y1 + min + Math.random() * (max - min);
            Interval1D interval2 = new Interval1D(y1, y2);
            Interval2D rectangle = new Interval2D(interval1, interval2);
            rectangle.draw();

            intervals[t] = rectangle;
            pointsFromInterval[t][0] = x1;
            pointsFromInterval[t][1] = x2;
            pointsFromInterval[t][2] = y1;
            pointsFromInterval[t][3] = y2;
        }

        int countOfIntersectIntervals = 0;
        int countOfContainIntervals = 0;
        for (int t0 = 0; t0 < N; t0++) {
            for (int t1 = t0 + 1; t1 < N; t1++) {
                if (intervals[t0].intersects(intervals[t1])) {
                    countOfIntersectIntervals++;
                }
            }

            for (int t2 = 0; t2 < N; t2++) {
                if (t0 != t2 &&
                        pointsFromInterval[t0][0] < pointsFromInterval[t2][0] &&
                        pointsFromInterval[t0][1] > pointsFromInterval[t2][1] &&
                        pointsFromInterval[t0][2] < pointsFromInterval[t2][2] &&
                        pointsFromInterval[t0][3] > pointsFromInterval[t2][3]) {
                    countOfContainIntervals ++;
                }
            }
        }

        StdOut.println("Количество пересекающихся пар интервалов: " + countOfIntersectIntervals);
        StdOut.println("Количество входящих друг в другка интервалов: " + countOfContainIntervals);
    }
}
