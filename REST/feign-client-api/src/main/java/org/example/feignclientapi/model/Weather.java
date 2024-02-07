package org.example.feignclientapi.model;

import lombok.Data;

@Data
public class Weather {
    private Location location;
    private Current current;
}
