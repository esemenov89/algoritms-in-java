import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average {

  public static void main(String[] args){
    // Среднее значение чисел из StdIn.
    double sum = 0.0;
    int cnt = 0;
    while (!StdIn.isEmpty()){
      // Чтение числа и накопление суммы
      sum += StdIn.readDouble();
      cnt++;
    }
    double avg = sum/cnt;
    StdOut.printf("Среднее - %.5f\n", avg);
  }
}