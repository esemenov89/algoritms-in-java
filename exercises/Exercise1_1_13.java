public class Exercise1_1_13 {
  public static void main(String[] args){
    int N=5;
    int M=10;
    int[][] arr = new int[N][M];
    for (int i = 0; i < N; i++){
      for (int j = 0; j < M; j++){
        arr[i][j] = (int) (Math.random() * 10);
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println();
    for (int i = 0; i < M; i++){
      for (int j = 0; j < N; j++){
        System.out.print(arr[j][i] + "\t");
      }
      System.out.println();
    }
  }
}