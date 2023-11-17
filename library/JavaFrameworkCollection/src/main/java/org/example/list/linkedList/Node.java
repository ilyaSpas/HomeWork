package org.example.list.linkedList;

public class Node<T> {
    public Node next;
    public T value;

    public Node(T value) {
       this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }
}
