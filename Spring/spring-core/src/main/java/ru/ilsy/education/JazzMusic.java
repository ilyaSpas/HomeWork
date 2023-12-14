package ru.ilsy.education;


import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music{

    private JazzMusic() {

    }

    public static JazzMusic getJazzMusic() {
        return new JazzMusic();
    }

    @Override
    public String getSong() {
        return "Jazzzz....";
    }

    public void doInit(){
        System.err.println("Initialization bean");
    }

    public void  doDestroy(){
        System.err.println("Destroy bean");
    }
}
