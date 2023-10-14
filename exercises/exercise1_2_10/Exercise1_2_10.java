package exercises.exercise1_2_10;

public class Exercise1_2_10 {

    public static void main(String[] args) {
        int N = 10000;
        int max = 1000;
        VisualCounter visualCounter = new VisualCounter(N, max);

        for (int i = 0; i < max; i++) {
            if (i >= 100 && i < 200 || i >= 300 && i < 400) {
                visualCounter.decrement();
            } else {
                visualCounter.increment();
            }
        }
    }
}

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Exercise1_2_9 largeW.txt < largeT.txt > outBinary.txt