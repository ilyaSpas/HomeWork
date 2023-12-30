package org.example.mapping.many_to_one;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateRunner {

    public static void main(String[] args) {

        Company company = Company.builder()
                .name("Google")
                .build();

        Employee employee = Employee.builder()
                .firstName("Ilya")
                .lastName("Spasskiy")
                .build();

        try (SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();

            Employee employee1 = session.get(Employee.class, 2L);
            System.out.println(employee1.getCompany().getName());

            transaction.commit();
        }
    }
}
