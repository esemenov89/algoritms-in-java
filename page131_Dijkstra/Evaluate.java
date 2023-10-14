package page131_Dijkstra;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        while (!StdIn.isEmpty()) {
            // Чтение элемента и вталкивание его в стек, если это операция.
            String s = StdIn.readString();
            if (s.equals("ex")) break;
            if (s.equals("("));
            else if (s.equals("+")) ops.push(s);
            else if (s.equals("-")) ops.push(s);
            else if (s.equals("*")) ops.push(s);
            else if (s.equals("/")) ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                // Если ")", то выталкивание, вычисление и вталкивание результата.
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("+")) v = vals.pop() + v;
                else if (op.equals("-")) v = vals.pop() - v;
                else if (op.equals("*")) v = vals.pop() * v;
                else if (op.equals("/")) v = vals.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            } // Элемент не операция и не скобка: вталкиваем значение double
            else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}

// for windows: run it in git bash
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" page131_Dijkstra.Evaluate
