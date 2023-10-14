package page59;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Exercise1_1_39 {
    public static int rank(int key, int[] a) {
        // Массив должен быть отсортирован.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key находится в a[lo..hi] или отсутствует.
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid])
                hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int T = Integer.valueOf(args[0]);
        int[] masN = new int[]{1000, 10_000, 100_000, 1_000_000};
        double[] averages = new double[masN.length];
        int N = 0;

        for (int j = 0; j < masN.length; j++) {
            N = masN[j];

            int[] n1 = new int[N];
            int[] n2 = new int[N];

            int count = 0;
            for (int k = 0; k < T; k++) {
                for (int i = 0; i < N; i++) {
                    n1[i] = StdRandom.uniform(0, 1_000_000);
                    n2[i] = StdRandom.uniform(0, 1_000_000);
                }
                int[] whiteList = n1;
                Arrays.sort(whiteList);

                for (int i = 0; i < N; i++) {
                    if (rank(n2[i], whiteList) >= 0) {
                        count++;
                    }
                }
            }
            averages[j] = Double.valueOf(count) / Double.valueOf(T);
        }

        for (int i = 0; i < averages.length; i++) {
            StdOut.print(averages[i] + " ");
        }
    }
}