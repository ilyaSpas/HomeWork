package ru.ilsy.hibernate.mapping.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ilsy.hibernate.config.Configuration;
import ru.ilsy.hibernate.entity.Department;
import ru.ilsy.hibernate.entity.Details;
import ru.ilsy.hibernate.entity.Employee;
import ru.ilsy.hibernate.util.SessionFactoryUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Configuration.class);

        try (SessionFactory sessionFactory =
                     context.getBean("sessionFactory", SessionFactoryUtil.class)
                             .getSessionFactory();
             Session session = sessionFactory.getCurrentSession()) {

            session.beginTransaction();

//            Employee employee = new Employee();
//            employee.setName("IVAN FOR TEST");
//            employee.setAge(18);
//
//            Department department = new Department();
//            department.setName("IT");
//
//            department.addEmployee(employee);
//
//            session.save(department);
//            session.save(employee);


//            Department department = session.get(Department.class, 1);
//            List<Employee> employees = department.getEmployees();
//
//            System.out.println(employees);

            Employee employee = session.get(Employee.class, 5);
            //System.out.println(employee.getDetails());
            System.out.println(employee);

            session.getTransaction().commit();
        }
    }
}
