package exercises.exercise1_2_13;

import edu.princeton.cs.algs4.Date;

public class Transaction {

    private final String who;      // customer
    private final Date when;     // date
    private final double amount;   // amount

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public String getWho() {
        return who;
    }

    public Date getWhen() {
        return when;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "who='" + who + '\'' +
                ", when=" + when +
                ", amount=" + amount +
                '}';
    }
}
