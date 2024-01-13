package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.Cascade;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person", schema = "public")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "owner")
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    private List<Item> items;

    @OneToOne(mappedBy = "person")
    @Cascade(org.hibernate.annotations.CascadeType.PERSIST)
    private Passport passport;

    public Person(String name) {
        this.name = name;
    }

    public void addItem(Item item){
        if (this.items == null){
            this.setItems(new ArrayList<>());
        }
        items.add(item);
        item.setOwner(this);
    }
}
