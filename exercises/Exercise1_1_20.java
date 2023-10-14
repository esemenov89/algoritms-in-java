import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_20 {
  public static void main(String[] args){
      long startTime = System.currentTimeMillis();
      int N = 10;
      double M = factorial(N);
      StdOut.println(ln(M));
      long timeSpent = System.currentTimeMillis() - startTime;
      StdOut.println("метод выполнялся " + timeSpent/1000 + " секунд");
  }
  public static long factorial(int N){
    if (N < 0){
      return -1;
    }
    if (N == 1) {
      return 1;
    }
    return factorial(N-1)*N;
  }
  public static double ln(double N){
    if (N <= 0){
      return -1;
    }
    if (N == 1) {
      return 0;
    }
    N = N/2.7183;
    if (N < 2.7183) {
      return N;
    }
    
    return ln(N)+1;
  }
}