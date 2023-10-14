public class Exercise1_1_9 {
  public static void main(String[] args){
    int N = Integer.valueOf(args[0]);
    String s = "";
    for (int n = N; n >0; n /= 2)
      s = (n % 2) + s;
    System.out.println(s);
  }
}