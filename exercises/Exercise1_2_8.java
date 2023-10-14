package exercises;

import edu.princeton.cs.algs4.*;

public class Exercise1_2_8 {

    public static void main(String[] args) {
        int a[] = new int[1_000_000];
        int b[] = new int[1_000_000];
        int t[] = a;
        a = b;
        b = t;
    }

    // Question: What do this function do? Is it effective enough?
    // Answer: This function copy from a array to b array and copy from b array to a array. And i think what this function is effective because copy doing by link
    // Absolutely right!
}
