package org.example.mapping.many_to_one;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "firstName", nullable = true, unique = false)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;
}
