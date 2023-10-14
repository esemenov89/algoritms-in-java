package page136_FixedCapacityStackOfAbstractType;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfAbstractTypeClient {
    public static void main(String[] args) {
        FixedCapacityStackOfAbstractType s;
        s = new FixedCapacityStackOfAbstractType(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
        }
        StdOut.println("(в стеке осталось " + s.size() + ")");
    }
}

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" page136_FixedCapacityStackOfAbstractType.FixedCapacityStackOfAbstractTypeClient < tobe.txt