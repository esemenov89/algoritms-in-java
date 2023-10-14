package page59;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearchWithSpentTime {
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
        long startTime = System.nanoTime();
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);

        while (!StdIn.isEmpty()) {
            // Чтение значения key и вывод, если его нет в белом списке.
            int key = StdIn.readInt();
            if (rank(key, whiteList) < 0)
                StdOut.println(key);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000/1000/1000;
        StdOut.println("Spent time: " + duration + " secs");
    }
}

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" page59.BinarySearchWithSpentTime largeW.txt < largeT.txt > outBinary.txt