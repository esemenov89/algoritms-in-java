public class Exercise1_1_17 {
  public static void main(String[] args){
  // My answer. Условие выхода после вычислений. Косвенно верно.
  }
  public static String exR2(int n){
    String s = exR2(n-3) + n + exR2(n-2) + n;
    if (n<=0) return "";
    return s;
  }
}