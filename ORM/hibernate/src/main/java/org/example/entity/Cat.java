package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cat", schema = "public")
public class Cat {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
}
