package org.example.project.weather;

import lombok.Data;

@Data
public class Current {
    private Condition condition;

    private String last_updated_epoch;
    private String last_updated;
    private String temp_c;
    private String temp_f;
    private String is_day;
}
