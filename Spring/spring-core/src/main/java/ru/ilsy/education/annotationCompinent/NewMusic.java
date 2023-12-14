package ru.ilsy.education.annotationCompinent;

import org.springframework.stereotype.Component;
import ru.ilsy.education.Music;

@Component("newMusic")
public class NewMusic implements Music {
    @Override
    public String getSong() {
        return "Some strange music...";
    }
}
