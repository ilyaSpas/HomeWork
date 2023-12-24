package ru.ilsy.education.for_testing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
public class Test {


    private Bean2 bean2;

    public Test(Bean2 bean2) {
        this.bean2 = bean2;
    }

    public void checkBean() {
        System.out.println(bean2.getName());
        System.out.println("volume: " + bean2.getVolume());
    }
}
