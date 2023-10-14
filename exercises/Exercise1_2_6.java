package exercises;

import edu.princeton.cs.algs4.*;

public class Exercise1_2_6 {

    public static void main(String[] args) {
        String s = args[0];
        String t = args[1];

        boolean isCycleRotate = false;
        if (s.length() == t.length()) {
            char[] s0 = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                char s00 = s0[0];
                for (int j = 0; j < s0.length - 1; j++) {
                    s0[j] = s0[j + 1];
                }
                s0[s0.length - 1] = s00;

                String s1 = String.valueOf(s0);
                if (s1.equals(t)) {
                    isCycleRotate = true;
                }
            }
        }

        StdOut.println(isCycleRotate);
    }
    // It code is working, but in book has the advice: it exercise may be solving in one line of code. I didn't found this solution.
}
