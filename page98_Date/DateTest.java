package page98_Date;

import edu.princeton.cs.algs4.StdOut;
import page98_Date.second.Date;

public class DateTest {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        Date date = new Date(m, d, y);
        StdOut.println(date);
    }
}
