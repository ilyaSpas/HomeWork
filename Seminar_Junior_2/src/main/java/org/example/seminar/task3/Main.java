package org.example.seminar.task3;

import java.util.UUID;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Employee employee = new Employee("Ivan", "ivan@Mail.ru");
        employee.setId(UUID.randomUUID());

        QueryBuilder queryBuilder = new QueryBuilder();
        String buildInsertQuery = queryBuilder.buildInsertQuery(employee);
        System.out.printf("Запрос: %s", buildInsertQuery);
    }
}
