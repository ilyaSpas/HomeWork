package org.example;

import org.example.dao.CoursesDao;
import org.example.entity.Courses;
import org.example.service.CoursesService;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CoursesService service = CoursesService.getInstance();

        Courses courses = new Courses();
        courses.setName("GB");
        courses.setDuration(100);
        service.save(courses);

//        Courses courses = service.get(3);
//        System.out.println(courses);

//        Courses courses = new Courses();
//        courses.setId(1);
//        courses.setName("GeekBrains");
//        service.update(courses);

//        Courses courses = new Courses();
//        courses.setId(2);
//        service.delete(courses);

    }
}