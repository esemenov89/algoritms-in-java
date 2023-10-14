package page100_Accumulator;

public class Accumulator {
    private double total;
    private int N;

    public void addDataValue(double val) {
        N++;
        total += val;
    }

    public double mean(){
        return total / N;
    }

    public String toString() {
        return "Среднее (" + N + " значений): "
                + String.format("%7.5f", mean());
    }
}
