package exercises.exercise1_2_18;

public class Accumulator {
    private double m;
    private double s;
    private int N;

    public void addDataValue(double x) {
        N++;
        s = s + 1.0 * (N-1) / N * (x - m) * (x - m);
        m = m + (x - m) / N;
    }

    public double mean(){
        return m;
    }

    public double var(){
        return s/(N - 1);
    }

    public double stddev(){
        return Math.sqrt(this.var());
    }

    public String toString() {
        return "Среднее (" + N + " значений): "
                + String.format("%7.5f", var()) + "\n" + "Дисперсия: "
                + String.format("%7.5f", stddev());
    }
}
