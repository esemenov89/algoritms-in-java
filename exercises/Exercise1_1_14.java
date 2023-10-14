public class Exercise1_1_14 {
  public static void main(String[] args){
      System.out.println(lg(17));
  }
  public static int lg(int N){
    if (N <= 1){
      return 0;
    }
    int m = 0, x = 1;
    while(x * 2 <= N){
      x *= 2;
      m++;
    }
    return m;
  }
}