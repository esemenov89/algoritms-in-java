package page147_StackByLinkedList;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    private Node first;
    private int N;
    private class Node {
        // вложенный класс для определения узлов
        Item item;
        Node next;
    }
    public boolean isEmpty() {
        return first == null; // Или N == 0
    }
    public int size() {
        return N;
    }
    public void push(Item item) {
        // Добавление элемента на верхушку стека.
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N++;
    }
    public Item pop() {
        // Удаление элемента с верхушки стека.
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public Iterator<Item> iterator() {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item> {
        private Node current = first;
        public boolean hasNext() {
            return current != null;
        }
        public void remove() {

        }
        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    public static void main(String[] args) {
        // Создание стека и вталкивание/выталкивание строк
        // в соответствии с командами из StdIn.
        Stack<String> s = new Stack<>();
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
// java -classpath "C:\Evgeny\work\projects\algorithms_in_java\out\production\algorithms_in_java;C:\Evgeny\work\projects\for_all_projects\algs4.jar" page147_StackByLinkedList.Stack < tobe.txt