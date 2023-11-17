package org.example.list.linkedList;

public class MyLinkedList<T> {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList();
        list.add(10);
        list.add(13);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(123);
        list.print();
    }
    private Node head;
    public void add(T value){
        Node node = new Node<T>(value);
        if (head != null) {
            node.setNext(head);
        }
        head = node;
    }

    public void print(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        Node node = head;
        while (node != null){
            stringBuilder.append(node.getValue()+ " ");
            node = node.getNext();
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder);
    }
}
