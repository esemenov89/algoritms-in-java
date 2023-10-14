public class Exercise1_1_16 {
  public static void main(String[] args){
  // My answer. 311361142246. Right.
    System.out.print(exR1(6));
  }
  public static String exR1(int n){
    if (n <= 0) return ""; // "311361142246"
    return exR1(n-3) + n + exR1(n-2) + n;
    // 3: "" + 3 + 1: "" + 1 + "" + 1 + 3
    // 4: 1: "" + 1 + "" + 1 + 4 + 2: "" + 2 + "" + 2 + 4 + 6
  }
}