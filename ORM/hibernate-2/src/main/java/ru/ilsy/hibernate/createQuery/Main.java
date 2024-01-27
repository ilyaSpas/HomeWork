package ru.ilsy.hibernate.createQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ilsy.hibernate.config.Configuration;
import ru.ilsy.hibernate.entity.Employee;
import ru.ilsy.hibernate.util.SessionFactoryUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configuration.class);

        try (SessionFactory sessionFactory =
                     context.getBean("sessionFactory", SessionFactoryUtil.class)
                             .getSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Employee set name = 'IVAN' where id = 2").executeUpdate() ;

            //в createQuery - указываем имя класса, а не название таблицы
//            List<Employee> employees = (List<Employee>) session.createQuery("FROM Employee " +
//                                                                            "where id >= 1")
//                    .getResultList();
//            System.out.println(employees);

            session.getTransaction().commit();

        }
    }
}
