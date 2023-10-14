package exercises;

import edu.princeton.cs.algs4.*;

import java.awt.*;

public class Exercise1_2_1 {

    public static void main(String[] args) {
        double xlo = 0;
        double xhi = .9;
        double ylo = 0;
        double yhi = .9;
        int N = Integer.parseInt(args[0]);
        Interval1D xint = new Interval1D(xlo, xhi);
        Interval1D yint = new Interval1D(ylo, yhi);
        Interval2D box = new Interval2D(xint, yint);
        Point2D[] points = new Point2D[N];
        Point2D[] nearestPoints = new Point2D[N];
        box.draw();
        for (int t = 0; t < N; t++) {
            double x = xlo + Math.random() * xhi;
            double y = ylo + Math.random() * yhi;
            Point2D p = new Point2D(x, y);
            points[t] = p;
            p.draw();
        }

        for (int t0 = 0; t0 < N; t0++) {
            int indexOfNiarestPoint = 0;
            double minDistance = 0;
            double distance = 0;
            for (int t1 = 0; t1 < N; t1++) {
                if (t0 != t1) {
                    distance = points[t0].distanceTo(points[t1]);
                    if (t1 == 0 || (t0 == 0 && t1 == 1)) {
                        minDistance = distance;
                        indexOfNiarestPoint = t1;
                    }
                    else if (distance < minDistance) {
                        minDistance = distance;
                        indexOfNiarestPoint = t1;
                    }
                }
            }
            nearestPoints[t0] = points[indexOfNiarestPoint];
        }

        double minDistance = 0;
        double distance = 0;
        int indexOfMinDistance = 0;
        for (int t0 = 0; t0 < N; t0++) {
            distance = points[t0].distanceTo(nearestPoints[t0]);
            if (t0 == 0) {
                minDistance = points[t0].distanceTo(nearestPoints[t0]);
                indexOfMinDistance = t0;
            } else if (distance < minDistance) {
                minDistance = distance;
                indexOfMinDistance = t0;
            }
        }

        StdDraw.setPenColor(Color.RED);
        StdDraw.line(points[indexOfMinDistance].x(), points[indexOfMinDistance].y(), nearestPoints[indexOfMinDistance].x(), nearestPoints[indexOfMinDistance].y());
        StdOut.println(minDistance);
    }
}
