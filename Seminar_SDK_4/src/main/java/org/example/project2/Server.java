package org.example.project2;

import java.util.ArrayList;
import java.util.List;

public class Server {
    List<Employer> allEmployers;
    List<Employer> varEmployers;

    public Server() {
        allEmployers = new ArrayList<>();
        varEmployers = new ArrayList<>();
    }

    public void saveEmployer(Employer employer) {
        allEmployers.add(employer);
        System.out.println("Сохранен новый пользователь " + employer);
    }

    public String getAllEmployers() {
        if (allEmployers.isEmpty()){
            return "Записная книга - пуста!";
        }
        return allEmployers.toString();
    }

    public String findByName(String name) {
        varEmployers.clear();
        for (Employer employer : allEmployers){
            if(employer.getName().equals(name)){
                varEmployers.add(employer);
            }
        }
        if (varEmployers.isEmpty()){
            return "Контакта с таким именем не найдено.";
        }
        return varEmployers.toString();
    }

    public String findByPhoneNumber(String phoneNumber) {
        varEmployers.clear();
        for (Employer employer : allEmployers){
            if(employer.getPhoneNumber().equals(phoneNumber)){
                varEmployers.add(employer);
            }
        }
        if (varEmployers.isEmpty()){
            return "Контакта с таким номером телефона не найдено.";
        }
        return varEmployers.toString();
    }

    public String findByExp(String exp) {
        varEmployers.clear();
        for (Employer employer : allEmployers){
            if(employer.getExperience().equals(exp)){
                varEmployers.add(employer);
            }
        }
        if (varEmployers.isEmpty()){
            return "Контакта с таким стажем не найдено.";
        }
        return varEmployers.toString();
    }
}
