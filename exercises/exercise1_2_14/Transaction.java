package exercises.exercise1_2_14;

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

    @Override
    public boolean equals(Object x) {
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Transaction that = (Transaction) x;
        if (!this.who.equals(that.who)) return false;
        if (!this.when.equals(that.when)) return false;
        if (this.amount != that.amount) return false;
        return true;
    }
}
