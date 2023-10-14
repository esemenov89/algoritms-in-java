package exercises.exercise1_2_12;

import java.util.HashMap;

public class SmartDate {

    private final int month;
    private final int day;
    private final int year;
    private static HashMap<Integer, Integer> amountDaysInYear = new HashMap<>();
    private static HashMap<Integer, Integer> amountDaysInMonth = new HashMap<>();
    private static HashMap<Integer, String> dayOfTheWeek = new HashMap<>();

    static {
        for (int i = 2000; i < 2100; i++) {
            if (i % 4 == 0) {
                amountDaysInYear.put(i, 366);
            } else {
                amountDaysInYear.put(i, 365);
            }
        }
        amountDaysInMonth.put(1, 31);
        amountDaysInMonth.put(2, 28);
        amountDaysInMonth.put(3, 31);
        amountDaysInMonth.put(4, 30);
        amountDaysInMonth.put(5, 31);
        amountDaysInMonth.put(6, 30);
        amountDaysInMonth.put(7, 31);
        amountDaysInMonth.put(8, 31);
        amountDaysInMonth.put(9, 30);
        amountDaysInMonth.put(10, 31);
        amountDaysInMonth.put(11, 30);
        amountDaysInMonth.put(11, 31);

        dayOfTheWeek.put(0, "Суббота");
        dayOfTheWeek.put(1, "Воскресенье");
        dayOfTheWeek.put(2, "Понедельник");
        dayOfTheWeek.put(3, "Вторник");
        dayOfTheWeek.put(4, "Среда");
        dayOfTheWeek.put(5, "Четверг");
        dayOfTheWeek.put(6, "Пятница");
    }

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

    public String dayOfTheWeek() {
        if (this.year < 2000 && this.year > 2100) {
            return null;
        } else {
            int days = 0;
            if (this.year != 2000) {
                for (int i = 2000; i < this.year; i++) {
                    days += amountDaysInYear.get(i);
                }
            }
            if (this.month != 1) {
                for (int i = 1; i < this.month; i++) {
                    if (i == 2 && this.year % 4 == 0) {
                        days += 29;
                    } else {
                        days += amountDaysInMonth.get(i);
                    }
                }
            }
            days += this.day - 1;

            return dayOfTheWeek.get(days % 7);
        }
    }

    public String toString() {
        return month() + "/" + day() + "/" + year();
    }
}
