package exercises.exercise1_2_10;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class VisualCounter {

    private int counter = 0;

    private int opertionCounter = 0;

    private int N;

    private int max;

    VisualCounter(int N, int max){
        this.N = N;
        this.max = max;
    }

    public void increment() {
        if (opertionCounter >= N) {
            StdOut.println("Превышено максимальное количество операций, дальнейшии операции с этим объектом запрещены");
        } else if (counter >= max){
            StdOut.println("Превышено максимальное значение счетчика, дальнейшии операции с этим объектом запрещены");
        } else {
            counter++;
            opertionCounter++;
            draw();
        }
    }

    public void decrement() {
        if (opertionCounter >= N) {
            StdOut.println("Превышено максимальное количество операций, дальнейшии операции с этим объектом запрещены");
        } else if (counter >= max){
            StdOut.println("Превышено максимальное значение счетчика, дальнейшии операции с этим объектом запрещены");
        } else {
            counter--;
            opertionCounter++;
            draw();
        }
    }

    public int tally() {
        return counter;
    }

    private void draw() {
        StdDraw.setPenRadius(0.01);
        StdDraw.point((double)counter/(double)max, (double)opertionCounter/(double)N);
    }

    public String toString(){
        return String.valueOf(counter);
    }
}
