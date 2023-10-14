package exercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Counter;

import java.util.Arrays;

public class Exercise1_2_15 {

    public static int[] readInts(String name) {
        //In in = new In(name);
        String input = StdIn.readAll();
        String words[] = input.split("//s+");
        int[] ints = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = readInts("Test");
        for (int i = 0; i < 100; i++) {
            StdOut.println(ints[i]);
        }
    }
}

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_2_15 < outBinary1.txt > outTest.txt