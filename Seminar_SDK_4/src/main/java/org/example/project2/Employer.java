package org.example.project2;

public class Employer implements Comparable<Employer>{
    private static int idCounter;
    private int id;
    private String phoneNumber;
    private String name;
    private String experience;

    public Employer(String phoneNumber, String name, String experience) {
        this.id = ++idCounter;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "\nId:" + id + " - " + ", имя: " + name + ", телефон - " + phoneNumber + ", стаж работы " + experience + " лет.\n";
    }

    @Override
    public int compareTo(Employer o) {
        return this.getName().compareTo(o.getName());
    }
}
