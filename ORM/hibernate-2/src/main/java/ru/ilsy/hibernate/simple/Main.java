package ru.ilsy.hibernate.simple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ilsy.hibernate.config.Configuration;
import ru.ilsy.hibernate.util.SessionFactoryUtil;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configuration.class);

        try (SessionFactory sessionFactory =
                     context.getBean("sessionFactory", SessionFactoryUtil.class)
                             .getSessionFactory()) {

            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();

            //save
//            Employee employee = new Employee("Masha", 29);
//            session.save(employee);

            //get
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);

            //update
//            Employee employee = session.get(Employee.class, 2);
//            employee.setAge(25);
//            System.out.println(employee);

            //delete
//            Employee employee = session.get(Employee.class, 1);
//            session.remove(employee);

            session.getTransaction().commit();

        }
    }
}
