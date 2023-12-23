package org.example.dao;

import org.example.entity.Courses;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CoursesDao implements Dao<Courses, Integer> {
    private static CoursesDao INSTANCE = new CoursesDao();

    private CoursesDao() {

    }

    @Override
    public Courses findById(Integer id) {
        Courses courses;
        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            courses = session.get(Courses.class, id);

            transaction.commit();
        }
        return courses;
    }

    @Override
    public void update(Courses courses) {
        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Courses newCourses = findById(courses.getId());
            newCourses.setName(courses.getName());
            session.merge(newCourses);

            transaction.commit();
        }
    }

    @Override
    public void delete(Courses courses) {
        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            session.remove(courses);

            transaction.commit();
        }
    }

    @Override
    public void save(Courses courses) {
        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            session.persist(courses);

            transaction.commit();
        }
    }

    public static CoursesDao getInstance() {
        return INSTANCE;
    }
}
