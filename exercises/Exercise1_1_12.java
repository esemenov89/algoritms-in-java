public class Exercise1_1_12 {
  public static void main(String[] args){
    // My answer. 0 1 2 3 4 5 6 7 8 9. Each digit on new row. Right!
    int[] a = new int[10];
    for (int i = 0; i < 10; i++)
      a[i] = 9 - i; // a[0] = 9,a[1] = 8,a[2] = 7,a[3] = 6,a[4] = 5,a[5] = 4,a[6] = 3,a[7] = 2,a[8] = 1,a[9] = 0
    for (int i = 0; i < 10; i++)
      a[i] = a[a[i]];// a[0] = 0,a[1] = 1,a[2] = 2,a[3] = 3,a[4] = 4,a[5] = 5,a[6] = 6,a[7] = 7,a[8] = 8,a[9] = 9
    for (int i = 0; i < 10; i++)
      System.out.println(i);
  }
}