package org.example;

import java.util.Comparator;

// связаный список, парамет-ый
public class LinkedList <T>{
    private Node head;

    // добавление первого элемента
    public void addFirst(T value){
         Node node = new Node();
         node.value = value;
         if(head != null){
             node.next = head;
         }
         head = node;
    }

    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        }
        else {
            Node lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    // удалить первый элемент
    public void removeFirst(){
        if (head != null){
            head = head.next;
        }
    }

    // удалить последний элемент
    public void removeLast(){
        if (head == null)
            return;
        Node node = head;
        while (node.next != null){
            if (node.next.next == null){
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;
    }

    // поиск элемента
    public boolean contains(T value){
        Node node = head;
        while (node != null){
            if (node.value.equals(value)){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    // sort
    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node != null){
            Node minValueNode = node;
            Node node2 = node.next;
            while (node2 != null){
                if (comparator.compare(minValueNode.value, node2.value) > 0){
                    minValueNode = node2;
                }
                node2 = node2.next;
            }
            if(minValueNode != node){
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }
            node = node.next;
        }
    }

    // разворот связаного списка
    public LinkedList<T> reverse(){
        LinkedList<T> reverseLinkedList = new LinkedList<T>();
        Node node = head;
        while (node != null){
            reverseLinkedList.addFirst(node.value);
            node = node.next;
        }
        return reverseLinkedList;
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append("\n");
            node = node.next;
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    // узел связаного списка, вложенный класс
    public class Node{
        // следуюший узел
        public Node next;
        // значение узла
        public T value;
    }
}
