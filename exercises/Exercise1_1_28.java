import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;
import java.util.*;

public class Exercise1_1_28 {
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
    int len = whiteList.length - 1;
    Arrays.sort(whiteList);
    int temp = -100500;
    int countForDelete = 0;
    
    for (int i = 0; i < len; i++){
      if (whiteList[i] == whiteList[i+1] || temp == whiteList[i+1]){
        temp = whiteList[i+1]; 
        whiteList[i+1] = -100500;
        countForDelete++;
      }      
    }
    
    int[] uniqueWhiteList = new int[whiteList.length - countForDelete];
    
    for (int i = 0, j = 0; i < uniqueWhiteList.length || j < whiteList.length; i++, j++){
      if(whiteList[j] == -100500){
        i--;
      } else {
        uniqueWhiteList[i] = whiteList[j];
      }
    }
        
    while(!StdIn.isEmpty()){
      // Чтение значения key и вывод, если его нет в белом списке.
      int key = StdIn.readInt();
      if (rank(key, uniqueWhiteList) < 0)
        System.out.println(key);
    }
  }
}

// java -classpath /opt/work/java/algs4/algs4.jar:/opt/work/java/projects/algorithms_in_java/exercises Excercise1_1_28 largeW.txt < largeT.txt > out.txt