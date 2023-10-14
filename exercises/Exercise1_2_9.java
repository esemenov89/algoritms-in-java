package exercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Counter;

import java.util.Arrays;

public class Exercise1_2_9 {

    public static int rank(int key, int[] a, Counter counter) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            counter.increment();
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            }
            else if (key > a[mid]) {
                lo = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        Counter counter = new Counter("keys_counter");

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist, counter) == -1) {
                StdOut.println(key);
            }
        }

        StdOut.println("--------------------------");
        StdOut.println(counter);
    }
}

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_2_9 largeW.txt < largeT.txt > outBinary.txt