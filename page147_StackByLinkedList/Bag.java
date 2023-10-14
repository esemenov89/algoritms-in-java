package page147_StackByLinkedList;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {
    private Node first; // первый узел списка
    private class Node {
        Item item;
        Node next;
    }
    public void add(Item item) {
        // совпадает с push() из Stack
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
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
}
