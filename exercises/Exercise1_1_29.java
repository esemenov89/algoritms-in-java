package exercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercise1_1_29 {
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

  public static int rank2(int key, int[] a){
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
    return lo;
  }

  public static int count(int[] a) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0) {
        count++;
      } else {
        return count;
      }
    }
    return count;
  }

  public static void main(String[] args){
    int[] whiteList = In.readInts(args[0]);
    Arrays.sort(whiteList);
    StdOut.print("Count of zero = " + count(whiteList));
        
    while(!StdIn.isEmpty()){
      // Чтение значения key и вывод, если его нет в белом списке.
      int key = StdIn.readInt();
      StdOut.println(rank2(key, whiteList));
    }
  }
}

// java -classpath C:/Evgeny/work/projects/for_all_projects/algs4.jar:C:/Evgeny/work/projects/algorithms_in_java/out/production/algorithms_in_java exercises.Excercise1_1_29 largeW.txt < largeT.txt > out.txt
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" exercises.Excercise1_1_29 largeW.txt < largeT.txt > out.txt