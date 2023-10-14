package page105_StaticSETofInts;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WhiteList {
    public static void main(String[] args) {
        int[] w = In.readInts(args[0]);
        StaticSETofInts set = new StaticSETofInts(w);
        while (!StdIn.isEmpty()) {
            // Чтение ключа и вывод, если его нет в булом списке.
            int key = StdIn.readInt();
            if (!set.contains(key)){
                StdOut.println(key);
            }
        }
    }
}

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" page105_StaticSETofInts.WhiteList largeW.txt < largeT.txt > out.txt