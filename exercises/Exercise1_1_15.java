public class Exercise1_1_15 {
  public static void main(String[] args){
    int[] a = {0, 1, 2, 3, 9, 9};
    int M = 10;
    int[] ans = histogram(a, M);
    for (int i = 0; i < M; i++){
      System.out.print(ans[i] + "\t");
    }
  }
  public static int[] histogram(int[] a, int M){
    int[] ans = new int[M];
    for (int i = 0; i < M; i++){
      for (int j = 0; j < a.length; j++){
        if(a[j] == i) {
          ans[i]++;
        }
      }
    }
    return ans;
  }
}