package page81_Rolls;

public class Counter {

    private String id;

    private int counter = 0;

    Counter(String id){
        this.id = id;
    }

    public void increment() {
        counter ++;
    }

    public int tally() {
        return counter;
    }

    public String toString(){
        return String.valueOf(counter) + " " + id;
    }
}
