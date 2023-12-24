package ru.ilsy.education.for_testing;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Test2 {


    private Bean1 bean1;

    @Autowired
    public Test2(Bean1 bean1) {
        this.bean1 = bean1;
    }

    public void checkBean() {
        System.out.println(bean1.getName());
        System.out.println("volume: " + bean1.getVolume());
    }
}
