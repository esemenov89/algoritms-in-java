package exercises.exercise1_2_17;

import edu.princeton.cs.algs4.StdOut;

public class Exercise1_2_17 {

    public static void main(String[] args) {
        Rational rational1 = new Rational(10 , 200);
        Rational rational2 = new Rational(20 , 400);

        Rational resultRational = rational1.plus(rational2);
        StdOut.println(resultRational);
        resultRational = resultRational.minus(rational2);
        StdOut.println(resultRational);
        resultRational = resultRational.times(rational2);
        StdOut.println(resultRational);
        resultRational = resultRational.divides(rational2);
        StdOut.println(resultRational);
    }
}

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_2_15 < outBinary1.txt > outTest.txt