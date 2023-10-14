public class Exercise1_1_18 {
  public static void main(String[] args){
  // mystery(2, 25)? My answer: 0. Wrong! 50!
  // mystery(3, 11)? My answer: 33. Right.
  // Какое значение вычисляет вызов mystery(a, b) для положительных целых аргументов a и b? My answer: multiply. Right.
  // А если заменить на умножение? My answer: power. Wrong
    System.out.println(mystery(200, 5));
  }
  public static int mystery(int a, int b){ // 3, 11; 6, 5; 12, 2; 24, 1; 48, 0;
    if (b == 0) return 0; // here5 (0)
    if (b % 2 == 0) return mystery(a+a, b/2); // here3(24)
    return mystery(a+a, b/2) + a; // here1(30)+3 here2(24)+6 here4(0)+24
  }
}