package com.example.springmvc.dao;

import com.example.springmvc.model.Person;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(1, "ivan"));
        people.add(new Person(2, "vasya"));
        people.add(new Person(3, "petya"));
        people.add(new Person(4, "Oleg"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(prerson -> prerson.getId() == id)
                .findAny().orElse(null);
    }

    public void save(Person person) {
        people.add(person);
    }

    public void delete(int id) {
        people.remove(show(id));
    }

    public void update(int id, Person person) {
        Person person1 = show(id);
        person1.setId(person1.getId());
        person1.setName(person.getName());
    }
}
