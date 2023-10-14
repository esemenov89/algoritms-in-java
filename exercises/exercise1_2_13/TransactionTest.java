package exercises.exercise1_2_13;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;

public class TransactionTest {

    public static void main(String[] args) {
        String person = "Ivan";
        Date dateTransaction = new Date(5, 27, 2020);
        double amount = 1000.10;

        Transaction transaction = new Transaction(person, dateTransaction, amount);
        StdOut.println(transaction);
    }
}
