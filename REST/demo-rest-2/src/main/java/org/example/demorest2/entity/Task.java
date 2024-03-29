package org.example.demorest2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tasks")
@Data
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private TaskStatus status;

    @Column(name = "date_of_create")
    private LocalDateTime dateOfCreate;

    @PrePersist
    private void init() {
        status = TaskStatus.CREATED;
        dateOfCreate = LocalDateTime.now();
    }
}
