package exercises;

import edu.princeton.cs.algs4.StdRandom;

public class Exercise1_1_37 {

    public static void main(String[] args) {
        int M = Integer.valueOf(args[0]);
        int N = Integer.valueOf(args[1]);

        double[] a = new double[M];
        double[][] answer = new double[M][M];
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < M; i++) {
                a[i] = i;
            }
            shuffle(a);
            for (int i = 0; i < M; i++) {
                for (int j= 0; j < M; j++) {
                    if (a[j] == i) {
                        answer[i][j]++;
                    }
                }
            }
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print((int) answer[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void shuffle(double[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            // Обмен a[i] со случайным элементом из a[i..N-1].
            int r = 0 + StdRandom.uniform(N-i);
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}

// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_1_35 10 0 10 < test1_1_32.txt