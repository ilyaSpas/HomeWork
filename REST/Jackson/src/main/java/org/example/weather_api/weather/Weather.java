package org.example.weather_api.weather;

import lombok.Data;

@Data
public class Weather {
    private Location location;

    private Current current;
}
