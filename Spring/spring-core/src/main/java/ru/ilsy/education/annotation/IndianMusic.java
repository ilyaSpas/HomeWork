package ru.ilsy.education.annotation;

import org.springframework.stereotype.Component;
import ru.ilsy.education.Music;

@Component
public class IndianMusic implements Music {
    @Override
    public String getSong() {
        return "Tadamp-tadamp- INDIA";
    }
}
