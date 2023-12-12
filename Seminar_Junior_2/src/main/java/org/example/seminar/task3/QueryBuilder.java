package org.example.seminar.task3;

import org.example.seminar.task3.annotation.Column;
import org.example.seminar.task3.annotation.Table;

import java.lang.reflect.Field;

public class QueryBuilder {
    public String buildInsertQuery(Object object) throws IllegalAccessException {

        Class<?> clazz = object.getClass();

        StringBuilder stringBuilder = new StringBuilder("INSERT INTO ");

        if (clazz.isAnnotationPresent(Table.class)) {

           Table tableAnnotation = clazz.getAnnotation(Table.class);

           stringBuilder.append(tableAnnotation.name());
           stringBuilder.append(" (");

            Field[] declaredFields = clazz.getDeclaredFields();

            for (int i = 0; i < declaredFields.length; i++) {
                if (declaredFields[i].isAnnotationPresent(Column.class)) {
                    Column columnAnnotation = declaredFields[i].getAnnotation(Column.class);
                    if (i != declaredFields.length - 1){
                        stringBuilder.append(columnAnnotation.name() + ", ");
                    } else {
                        stringBuilder.append(columnAnnotation.name() + ") ");
                    }
                }
            }

            stringBuilder.append("VALUES (");

            for (int i = 0; i < declaredFields.length; i++) {
                if (declaredFields[i].isAnnotationPresent(Column.class)) {
                    declaredFields[i].setAccessible(true);
                    if (i != declaredFields.length - 1){
                        stringBuilder.append("'" + declaredFields[i].get(object) + "', ");
                    } else {
                        stringBuilder.append("'" + declaredFields[i].get(object) + "') ");
                    }
                }
            }

            return stringBuilder.toString();
        } else {
            return null;
        }
    }

    public String buildDeleteQuery(Object object) throws IllegalAccessException {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder stringBuilder = new StringBuilder("DELETE FROM ");

        if (clazz.isAnnotationPresent(Table.class)){
            Table tableAnnotation = clazz.getAnnotation(Table.class);
            stringBuilder.append(tableAnnotation.name());
        }

        stringBuilder.append(" WHERE ");

        for (Field field : fields){
            if (field.isAnnotationPresent(Column.class)){
                field.setAccessible(true);
                Column fieldAnnotation = field.getAnnotation(Column.class);
                if (fieldAnnotation.primaryKey()){
                    stringBuilder.append(fieldAnnotation.name() + " = '");
                    stringBuilder.append(field.get(object) + "'");
                }
            }
        }

        return stringBuilder.toString();
    }

}
