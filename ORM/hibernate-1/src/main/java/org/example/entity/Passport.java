package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "passport", schema = "public")
public class Passport {
    @Id
    @OneToOne
    @JoinColumn(name = "passport_id", referencedColumnName = "id")
    private Person person;

    @Column(name = "passport_number")
    private long passportNumber;
}
