package exercises.exercise1_2_11;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1_2_11 {

    public static void main(String[] args) {
        SmartDate date1 = new SmartDate(12, 31, 1);
        StdOut.println(date1);

        SmartDate date2 = new SmartDate(13, 31, 1);
        StdOut.println(date2);
    }
}

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_2_9 largeW.txt < largeT.txt > outBinary.txt