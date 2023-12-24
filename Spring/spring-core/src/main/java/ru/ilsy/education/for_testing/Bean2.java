package ru.ilsy.education.for_testing;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
public class Bean2 {
    @Value("${musicPlayer.volume}")
    private int volume;
    private String name = "Test Bean2";
}
