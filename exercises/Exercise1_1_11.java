public class Exercise1_1_11 {
  public static void main(String[] args){
    boolean[][] arr = {{true, false},{true, false}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
           System.out.print("Row:"+i+", Column:"+j+": ");
           if (arr[i][j]) {
             System.out.print("*");
           } else {
             System.out.print(" ");
           }
           System.out.print(" ");
			}
			System.out.println();
		}
  }
}