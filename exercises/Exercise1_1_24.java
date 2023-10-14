//import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
//import java.util.Arrays;

public class Exercise1_1_24 {
  public static void main(String[] args){
    System.out.println("Type two digits");
    int val1= StdIn.readInt();
    int val2= StdIn.readInt();
    int answer = gcd(val1,val2);
    StdOut.println("answer: " + answer);
  }
  
  public static int gcd(int p, int q){
    StdOut.println("val1:" + p + " val2:" + q);
    if (q==0) return p;
    int r = p % q;
    return gcd(q,r);
  }
}

// Runing another program. Example runing program through console.
// java -classpath /opt/work/java/algs4/algs4.jar:/opt/work/java/projects/algorithms_in_java/exercises Excercise1_1_23 largeW.txt -1 < largeT.txt > out.txt
