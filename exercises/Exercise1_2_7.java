package exercises;

import edu.princeton.cs.algs4.*;

public class Exercise1_2_7 {

    public static void main(String[] args) {
        StdOut.println(mystery("abcdef"));
    }

    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }
    // Question: What this recursive function do return?
    // Answer: This recursive function returns original string.
    // Wrong! This recursive function returns inverse string. I answered wrong because i hadn't seen what in return from this function places changed for a and b variables.
}
