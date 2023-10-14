package exercises;

import edu.princeton.cs.algs4.*;

public class Exercise1_2_4 {

    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
    }
    // Question: What this code fragment will output?
    // Answer: This code fragment will output:
    // world
    // hello
    // Right!
}
