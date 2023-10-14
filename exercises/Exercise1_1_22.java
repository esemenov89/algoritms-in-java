import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.*;

public class Exercise1_1_22 {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    int key = 25;
    int[] mass = {0,1,23,45,24,25,789,232,22};
    System.out.println(rank(key, mass, 0));
  }
  
  public static int rank(int key, int[] a, int deep){
    return rank(key, a, 0, a.length - 1, deep);
  }
  
  public static int rank(int key, int[] a, int lo, int hi, int deep) {
    for (int i=0; i < deep; i++) {
      System.out.print(" ");
    }
    System.out.println("lo=" + lo + " hi=" + hi);
    
    if (lo > hi) return -1;
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) return rank (key, a, lo, mid - 1, deep + 1);
    else if (key > a[mid]) return rank(key, a, mid + 1, hi, deep + 1);
    else return mid;
  }
}
