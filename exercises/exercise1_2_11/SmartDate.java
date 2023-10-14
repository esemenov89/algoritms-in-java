package exercises.exercise1_2_11;

public class SmartDate {

    private final int month;
    private final int day;
    private final int year;

    public SmartDate(int m, int d, int y) {
        if (m < 1 || m > 12 || d < 1 || d > 31 || y < 1) {
            throw new RuntimeException("Задана несуществующая дата");
        }
        month = m;
        day = d;
        year = y;
    }

    public int month() {
        return month;
    }

    public int day() {
        return day;
    }

    public int year() {
        return year;
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }
}
