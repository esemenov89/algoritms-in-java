package exercises;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdIn;

public class Exercise1_1_30 {
  public static void main(String[] args){
    StdOut.println("Type N: ");
    int N = StdIn.readInt();
    boolean[][] logicallyArray = new boolean[N][N];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (gcd(i, j) <= 1) {
          logicallyArray[i][j] = true;
        } else {
          logicallyArray[i][j] = false;
        }
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        StdOut.print("[" + i + "][" + j + "]=" + logicallyArray[i][j]);
      }
      StdOut.println();
    }
  }

  private static int gcd(int p, int q){
    if (q==0) return p;
    int r = p % q;
    return gcd(q,r);
  }
}

// Runing another program. Example runing program through console.
// java -classpath /opt/work/java/algs4/algs4.jar:/opt/work/java/projects/algorithms_in_java/exercises Excercise1_1_27 largeW.txt -1 < largeT.txt > out.txt
