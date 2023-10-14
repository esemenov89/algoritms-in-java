package exercises;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_32 {
    public static void main(String[] args){
        int N = Integer.valueOf(args[0]);
        double l = Double.valueOf(args[1]);
        double r = Double.valueOf(args[2]);
        int[] arr = new int[N];
        double part = 0;
        if (l > r) {
            part = (l - r)/N;
        } else {
            part = (r - l)/N;
        }
        while(!StdIn.isEmpty()){
            // Чтение значения key и вывод, если его нет в белом списке.
            double value = StdIn.readDouble();
            arr[Long.valueOf((long)Math.floor(value/part)).intValue()]++;
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0*i/N;
            double y = 1/2.0;
            double rw = 0.5/N;
            double rh = Double.valueOf(arr[i])/N;
            StdOut.println(rh);
            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }
}

// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_1_32 10 0 10 < test1_1_32.txt