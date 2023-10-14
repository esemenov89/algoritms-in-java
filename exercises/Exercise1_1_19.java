import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_19 {
  public static void main(String[] args){
  // Какое наибольшее значение N, для которого программа вычисляет значение F(N) менее чем за час
  // По моим подсчетам, при N = 56
    for (int N = 0; N < 100; N++) {
      long startTime = System.currentTimeMillis();
      StdOut.println(N + " " + F(N));
      long timeSpent = System.currentTimeMillis() - startTime;
      System.out.println("метод выполнялся " + timeSpent/1000 + " секунд");
    }
  }
  public static long F(int N){
    if (N == 0) return 0;
    if (N == 1) return 1;
    long n0 = 1;
    long n1 = 1;
    long fib = 2L;
    for (int i = 3; i <= N; i++){
      fib = n0 + n1;
      n0 = n1;
      n1 = fib; 
    }
    return fib;
  }
}