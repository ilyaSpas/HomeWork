package ru.ilsy.education.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfiguration {
    @Bean
    public Music1 music1Bean() {
        return new Music1();
    }

    @Bean
    public MusicPlayerV3 musicPlayerBean() {
        return new MusicPlayerV3(music1Bean());
    }
}
