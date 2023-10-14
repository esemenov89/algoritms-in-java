class MySqrt {

  public static void main(String[] args){
    System.out.println(sqrt(2));
  }
  
  public static double sqrt(double c) {
    double err = 1e-15;
    double t = c;
    while (Math.abs(t-c/t)>err*t)
      t=(c/t + t)/2.0;
    return t;
  }
}