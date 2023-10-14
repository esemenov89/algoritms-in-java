//import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
//import java.util.Arrays;

public class Exercise1_1_26 {
  public static void main(String[] args){
    int t = 0;
    StdOut.println("Type number a:");
    int a = StdIn.readInt();
    StdOut.println("Type number b:");
    int b = StdIn.readInt();
    StdOut.println("Type number c:");
    int c = StdIn.readInt();

    if (a > b) {
      t = a;
      a = b;
      b = t;
      StdOut.println("a=" + a + " b=" + b + " c=" + c);
    }
    if (a > c) {
      t = a;
      a = c;
      c = t;
      StdOut.println("a=" + a + " b=" + b + " c=" + c);
    }
    if (b > c) {
      t = b;
      b = c;
      c = t;
      StdOut.println("a=" + a + " b=" + b + " c=" + c);
    }
  }
}

// Runing another program. Example runing program through console.
// java -classpath /opt/work/java/algs4/algs4.jar:/opt/work/java/projects/algorithms_in_java/exercises Excercise1_1_23 largeW.txt -1 < largeT.txt > out.txt
