package exercises.exercise1_2_19;

import edu.princeton.cs.algs4.StdOut;

public class TestConstructors {

    public static void main(String[] args) {
        Date date = new Date("5/22/1939");
        StdOut.println(date);

        Transaction transaction = new Transaction("Turing  5/22/1939    11.99");
        StdOut.println(transaction);
    }
}
