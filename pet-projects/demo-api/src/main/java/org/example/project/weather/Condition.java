package org.example.project.weather;

import lombok.Data;

@Data
public class Condition {
    private String text;
    private String icon;
    private String code;
}
