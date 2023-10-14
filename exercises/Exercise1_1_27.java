//import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
//import java.util.Arrays;

public class Exercise1_1_27 {
  private static long counter = 0;
  public static void main(String[] args){
    // TODO: Function binominal mast be save numbers in array
    StdOut.println("answer: " + binominal(100, 50, 1.0));
    StdOut.println("counter: " + counter);
  }
  
  public static double binominal(int N, int k, double p){
    if (N == 0 && k == 0) return 1.0;
    if (N < 0 || k < 0) return 0.0;
    return (1.0 - p)*binominal(N-1, k, p) + p*binominal(N-1, k-1, p);
  }
}

// Runing another program. Example runing program through console.
// java -classpath /opt/work/java/algs4/algs4.jar:/opt/work/java/projects/algorithms_in_java/exercises Excercise1_1_27 largeW.txt -1 < largeT.txt > out.txt
