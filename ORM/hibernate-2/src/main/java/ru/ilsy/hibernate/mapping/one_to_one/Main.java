package ru.ilsy.hibernate.mapping.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ilsy.hibernate.config.Configuration;
import ru.ilsy.hibernate.entity.Details;
import ru.ilsy.hibernate.entity.Employee;
import ru.ilsy.hibernate.util.SessionFactoryUtil;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configuration.class);

        try (SessionFactory sessionFactory =
                     context.getBean("sessionFactory", SessionFactoryUtil.class)
                             .getSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();

//            Employee employee = new Employee("Arsen", 30);
//            Details details = new Details("test1@mail.ru", "1234567");
//
//            employee.setDetails(details);
//            details.setEmployee(employee);
//
//            session.save(employee);


            Employee employee = session.get(Employee.class, 3);
            employee.setDetails(null);
            session.save(employee);

            Details details = session.get(Details.class, 8);
            session.remove(details);

            session.getTransaction().commit();
        }
    }
}
