import edu.princeton.cs.algs4.StdOut;

public class Exercise1_1_7 {
  public static void main(String[] args){
  // а) My answer. This program will output: 3.00009. Right.
    double t = 9.0;
    while (Math.abs(t - 9.0/t)>.001)
      t = (9.0/t + t)/2.0; 
    StdOut.printf("%.5f\n", t);
    
    // б) My answer. This program will output: 1000000. Wrong! Right answer: 499500
    int sum = 0;
    for (int i = 1; i < 1000; i++) 
      for (int j = 0; j < i; j++) 
        sum++; 
    StdOut.println(sum);
    
    // в) My answer. This program will output: 249750. Wrong! Right answer: 1023
    int sum2 = 0;
    for (int i = 1; i < 1000; i *= 2) 
      for (int j = 0; j < i; j++) 
        sum2++; 
    StdOut.println(sum2);
  }
}