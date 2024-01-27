package ru.ilsy.hibernate.mapping.many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.ilsy.hibernate.config.Configuration;
import ru.ilsy.hibernate.entity.Child;
import ru.ilsy.hibernate.entity.Details;
import ru.ilsy.hibernate.entity.Employee;
import ru.ilsy.hibernate.entity.Section;
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

            Section section = new Section("IT");
            Child child1 = new Child("Artem");
            Child child2 = new Child("Azamat");
            Child child3 = new Child("Lex");

            section.addChild(child1);
            section.addChild(child2);
            section.addChild(child3);

            session.persist(section);

//            List<Child> children = section.getChildren();
//            for (Child child : children){
//                System.out.println(child.getName());
//            }

            session.getTransaction().commit();
        }
    }
}
