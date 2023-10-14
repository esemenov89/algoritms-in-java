package exercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise1_1_38 {
    public static int rank(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
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
        long duration = (endTime - startTime);
        StdOut.println("Spent time: " + duration);
    }
}
// Сonclusion: I ran this program and did not wait for the end of execution, it worked for about 15 minutes
// But: I ran BinarySearchWithSpentTime. It worked for about 16 secs!! OMG

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_1_38 largeW.txt < largeT.txt > out.txt
