import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Exercise1_1_23 {
  public static int rank(int key, int[] a){
    // Массив должен быть отсортирован.
    int lo = 0;
    int hi = a.length - 1;
    while (lo <= hi){
      // Key находится в a[lo..hi] или отсутствует.
      int mid = lo + (hi - lo) / 2;
      if (key < a[mid])
        hi = mid - 1;
      else if (key > a[mid]) lo = mid + 1;
      else return mid;
    }
    return -1;
  }

  public static void main(String[] args){
    int[] whiteList = In.readInts(args[0]);
    int arg2 = Integer.parseInt(args[1]);
    Arrays.sort(whiteList);
    
    while(!StdIn.isEmpty()){
      // Чтение значения key и вывод, если его нет в белом списке.
      int key = StdIn.readInt();
      if (arg2 >= 0) {
        if (rank(key, whiteList) < 0)
          StdOut.println(key);
      } else {
        if (rank(key, whiteList) >= 0)
          StdOut.println(key);
      }
    }
  }
}

// java -classpath /opt/work/java/algs4/algs4.jar:/opt/work/java/projects/algorithms_in_java/exercises Excercise1_1_23 largeW.txt -1 < largeT.txt > out.txt
