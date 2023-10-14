import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Exercise1_1_31 {
    public static void main(String[] args){
        int N = Integer.valueOf(args[0]);
        double p = Double.valueOf(args[1]);
        StdDraw.setXscale(-100, 100);
        StdDraw.setYscale(-100, 100);
        StdDraw.setPenRadius(.01);
        double a = 0, x = 0, y = 0, x0 = 0, y0 = 0, xStart = 0, yStart = 0;
        int R = 50;
        for(int i = 1; i <= N; i++){
            a = Math.PI * (Double.valueOf(i * 2) / Double.valueOf(N));
            x = R * Math.cos(a);
            y = R * Math.sin(a);
            if (i == 1) {
                xStart = x;
                yStart = y;
            }

            if (i > 1 && Math.random() <= p) {
                StdDraw.setPenColor(Color.gray);
                StdDraw.line(x0, y0, x, y);
                StdDraw.setPenColor(Color.BLACK);
                StdDraw.point(x0, y0);
            }
            if (i == N && Math.random() <= p) {
                StdDraw.setPenColor(Color.gray);
                StdDraw.line(xStart, yStart, x, y);
                StdDraw.setPenColor(Color.BLACK);
                StdDraw.point(xStart, yStart);
            }

            x0 = x;
            y0 = y;
            StdDraw.point(x, y);
        }
    }
}
