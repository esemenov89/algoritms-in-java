package exercises.exercise1_2_12;

import edu.princeton.cs.algs4.StdOut;
import exercises.exercise1_2_12.SmartDate;

public class Exercise1_2_12 {

    public static void main(String[] args) {
        SmartDate date1 = new SmartDate(5, 26, 2020);
        StdOut.println(date1);
        StdOut.println(date1.dayOfTheWeek());
    }
}

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_2_9 largeW.txt < largeT.txt > outBinary.txt