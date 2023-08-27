package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employeeLinkedList = new LinkedList<>();

        employeeLinkedList.addFirst(new Employee("Ilya", 28));
        employeeLinkedList.addFirst(new Employee("Nikita", 31));
        employeeLinkedList.addFirst(new Employee("Kaye", 29));
        employeeLinkedList.addFirst(new Employee("Kaye", 31));
        employeeLinkedList.addFirst(new Employee("Nikita", 12));
        employeeLinkedList.addLast(new Employee("Roza", 22));
        employeeLinkedList.addLast(new Employee("Oleg", 42));
        employeeLinkedList.addFirst(new Employee("Ilya", 28));

        System.out.println(employeeLinkedList);

//        employeeLinkedList.removeFirst();
//        employeeLinkedList.removeLast();
//
//        Employee employee = new Employee("Kaye", 29);
//        System.out.println(employeeLinkedList.contains(employee));
//
//        System.out.println(employeeLinkedList);
//
//        employeeLinkedList.sort(new EmployeeNameComparator(SortType.Ascending));
//
//        System.out.println(employeeLinkedList);
//
//        employeeLinkedList.sort(new EmployeeNameComparator(SortType.Descending));
//
//        System.out.println(employeeLinkedList);

        LinkedList<Employee> employeeLinkedList2 = employeeLinkedList.reverse();
        System.out.println(employeeLinkedList2);



    }
}