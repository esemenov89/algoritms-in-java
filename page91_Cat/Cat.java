package page91_Cat;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

public class Cat {

    public static void main(String[] args) {
        // Копирование входных файлов в out (последний аргумент).
        Out out = new Out(args[args.length-1]);
        for (int i = 0; i < args.length - 1; i++) {
            // Копирование в out входного файла с именем из i-го аргумента.
            In in = new In(args[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}
