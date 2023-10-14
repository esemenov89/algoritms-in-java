import edu.princeton.cs.algs4.StdIn;

public class Exercise1_1_3 {
  public static void main(String[] args){
    int i1 = Integer.valueOf(args[0]);
    int i2 = Integer.valueOf(args[1]);
    int i3 = Integer.valueOf(args[2]);
    if (i1 == i2 && i2 == i3) {
      System.out.println("равны");
    } else {
      System.out.println("неравны");
    }
  }
}