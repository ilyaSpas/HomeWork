package com.example.springmvc.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Min(value = 0, message = "WRONG ID")
    private int id;
    @NotEmpty(message = "NOT EMPTY NAME")
    @Size(min = 2, max = 20, message = "WRONG SIZE")
    private String name;
}
