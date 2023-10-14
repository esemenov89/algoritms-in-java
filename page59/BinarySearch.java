package page59;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
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
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);

        while (!StdIn.isEmpty()) {
            // Чтение значения key и вывод, если его нет в белом списке.
            int key = StdIn.readInt();
            if (rank(key, whiteList) < 0)
                StdOut.println(key);
        }
    }
}