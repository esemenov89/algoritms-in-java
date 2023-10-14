package exercises;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_33 { // TODO: It exercise not a solved
    public static void main(String[] args){
        double[][] a1 = new double[][]{{1, 2}, {2, 3}, {3, 4}};
        double[][] a2 = new double[][]{{11, 12, 13}, {14, 15, 16}};

        // Тестирование транспонирования
        double[][] b = transponse(a1);
        for (int i=0; i<b.length; i++) {
            for (int j=0; j<b[0].length; j++) {
                StdOut.print(b[i][j] + " ");
            }
            StdOut.println();
        }

        StdOut.println();
        for (int i=0; i<a1.length; i++) {
            for (int j=0; j<a1[0].length; j++) {
                StdOut.print(a1[i][j] + " ");
            }
            StdOut.println();
        }

        StdOut.println();
        for (int i=0; i<a2.length; i++) {
            for (int j=0; j<a2[0].length; j++) {
                StdOut.print(a2[i][j] + " ");
            }
            StdOut.println();
        }
    }

    public static double dot(double[] x, double[] y) {
        return 0.0;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a[0].length];
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<a[0].length; j++) {
                StdOut.print(a[i][j] + " ");
            }
            StdOut.println();
        }

        return new double[1][1];
    }

    public static double[][] transponse(double[][] a) {
        double[][] b = new double[a[0].length][a.length];
        double[] temp = new double[a[0].length * a.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        }

        return b;
    }
}

// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_1_32 10 0 10 < test1_1_32.txt