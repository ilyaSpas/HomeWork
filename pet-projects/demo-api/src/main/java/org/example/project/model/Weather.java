package org.example.project.model;

import lombok.Data;

@Data
public class Weather {
    private Location location;

    private Current current;

    private String wind_mph;
    private String wind_kph;
    private String wind_degree;
    private String wind_dir;
    private String pressure_mb;
    private String pressure_in;
    private String precip_mm;
    private String precip_in;
    private String humidity;
    private String cloud;
    private String feelslike_c;
    private String feelslike_f;
    private String vis_km;
    private String vis_miles;
    private String uv;
    private String gust_mph;
    private String gust_kph;
}
