package page40_RecurcieveBinarySearch;

public class BinarySearch {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    int key = 25;
    int[] mass = {0,1,23,45,24,25,789,232,22};
    System.out.println(rank(key, mass));
  }
  
  public static int rank(int key, int[] a){
    return rank(key, a, 0, a.length - 1);
  }
  
  public static int rank(int key, int[] a, int lo, int hi) {
    if (lo > hi) return -1;
    int mid = lo + (hi - lo) / 2;
    if (key < a[mid]) return rank (key, a, lo, mid - 1);
    else if (key > a[mid]) return rank(key, a, mid + 1, hi);
    else return mid;
  }
}