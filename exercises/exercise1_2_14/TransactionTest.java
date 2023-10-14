package exercises.exercise1_2_14;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;

public class TransactionTest {

    public static void main(String[] args) {
        String person1 = "Ivan";
        Date dateTransaction1 = new Date(5, 27, 2020);
        double amount1 = 1000.10;

        Transaction transaction1 = new Transaction(person1, dateTransaction1, amount1);

        String person2 = "Ivan";
        Date dateTransaction2 = new Date(5, 27, 2020);
        double amount2 = 1000.10;

        Transaction transaction2 = new Transaction(person2, dateTransaction2, amount2);

        String person3 = "Ivan";
        Date dateTransaction3 = new Date(5, 28, 2020);
        double amount3 = 1000.10;

        Transaction transaction3 = new Transaction(person3, dateTransaction3, amount3);

        if (transaction1.equals(transaction2)) {
            StdOut.println("Transaction1 is equally transaction2");
        } else {
            StdOut.println("Transaction1 isn't equally transaction2");
        }

        if (transaction1.equals(transaction3)) {
            StdOut.println("Transaction1 is equally transaction3");
        } else {
            StdOut.println("Transaction1 isn't equally transaction3");
        }

        if (transaction2.equals(transaction3)) {
            StdOut.println("Transaction2 is equally transaction3");
        } else {
            StdOut.println("Transaction2 isn't equally transaction3");
        }
    }
}
