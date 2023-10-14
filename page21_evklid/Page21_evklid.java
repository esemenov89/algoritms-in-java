class Page21_evklid {

  public static void main(String[] args){
    System.out.println("Hello world");
    int answer = gcd(10,13);
    System.out.println(answer);
    // master temp commit
  }
  
  public static int gcd(int p, int q){
    if (q==0) return p;
    int r = p % q;
    return gcd(q,r);
  }
}