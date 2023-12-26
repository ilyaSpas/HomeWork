package org.example.mapping.many_to_one;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @ManyToOne(cascade = CascadeType.,
            optional = false,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "company_id")
    private Company company;
}
