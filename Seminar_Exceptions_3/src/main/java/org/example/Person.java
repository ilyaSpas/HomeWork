package org.example;

public class Person {
    private String surName;
    private String name;
    private String fatherName;
    private String birthday;
    private String phoneNumber;
    private String male;

    public Person(String surName, String name, String fatherName, String birthday, String phoneNumber, String male) throws MyException {

        surName = surName.substring(0, 1).toUpperCase() + surName.substring(1);
        this.surName = surName;

        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.name = name;

        fatherName = fatherName.substring(0, 1).toUpperCase() + fatherName.substring(1);
        this.fatherName = fatherName;

        if (birthday.matches("\\d{2}.\\d{2}.\\d{4}")){
            this.birthday = birthday;
        } else {
            throw new  MyException("Не верный формат дня рождения");
        }

        if (phoneNumber.length() == 11){
            this.phoneNumber = phoneNumber;
        } else {
            throw new MyException("Не верный формат телефона.");
        }

        if(male.equals("F") || male.equals("M") ) {
            this.male = male;
        } else {
            throw new MyException("Не верный формат пола.");
        }

    }

    @Override
    public String toString() {
        return surName + " " + name + " " + fatherName + " " + birthday+ " " + phoneNumber + " " + male;
    }


}
