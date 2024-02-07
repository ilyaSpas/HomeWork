package org.example.feignclientapi.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "api.weather")
public class WeatherApiProperties {
    private String key;
    private String lang;
    private String town;
}
