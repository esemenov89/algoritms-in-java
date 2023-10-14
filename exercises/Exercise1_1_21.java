import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.*;

public class Exercise1_1_21 {
  public static void main(String[] args){
      long startTime = System.currentTimeMillis();
      List<InnerClass> nameList = new ArrayList();
      
      String read = "";
      String[] readArray = new String[3];
      while (!read.equals("exit")) {
        read = StdIn.readLine();
        if (read.equals("exit")) {
          break;
        }
        readArray = read.split(" ");
        
        InnerClass inner = new InnerClass(readArray[0], readArray[1], readArray[2]);
        nameList.add(inner);
      }
      
      for (InnerClass inner : nameList) {
        System.out.printf("%s %d %d %.3f \n", inner.getName(), inner.getValue1(), inner.getValue2(), inner.getResult());
      }
      
      //System.out.printf("%s ",name);
      long timeSpent = System.currentTimeMillis() - startTime;
      StdOut.println("метод выполнялся " + timeSpent/1000 + " секунд");
  }
  
  static class InnerClass {
    private String name;
    private Integer value1;
    private Integer value2;
    
    
    public InnerClass(String name, String value1, String value2){
      this.name = name;
      this.value1 = value1 == null ? null : Integer.parseInt(value1);
      this.value2 = value2 == null ? null : Integer.parseInt(value2);
    }
    
    public void setName(String name) {
      this.name = name;
    }
    
    public String getName() {
      return this.name;
    }
    
    public void setValue1(Integer value1) {
      this.value1 = value1;
    }
    
    public Integer getValue1() {
      return this.value1;
    }
    
    public void setValue2(Integer value2) {
      this.value2 = value2;
    }
    
    public Integer getValue2() {
      return this.value2;
    }
    
    public Double getResult(){
      double val1 = 0.0;
      double val2 = 0.0;
      if (this.value1 != null) {
        val1 = Double.valueOf(this.value1);
      }
      
      if (this.value2 != null) {
        val2 = Double.valueOf(this.value2);
      }
      return val1/val2;
    }
  }
}
