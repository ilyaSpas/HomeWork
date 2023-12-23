package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Embedded
    @AttributeOverride(name = "height", column = @Column(name = "height"))
    @AttributeOverride(name = "weight", column = @Column(name = "weight"))
    @AttributeOverride(name = "birthday", column = @Column(name = "birthday"))
    private DogInfo dogInfo;

}
