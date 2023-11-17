package org.example;

import static org.example.Utils.getRandomNumber;

public class Level {
    private Door firsDoor;
    private Door secondDoor;
    private Door thirdDoor;
    private Person person;
    private final String massageForWin = "И он выйгрывает!";
    private final String massageForLose = "и за дверью находится коза...";
    private final String choiceMassage = " выбирает дверь номер №";
    public Level(Person person){
        this.person = person;
        firsDoor = new Door();
        secondDoor = new Door();
        thirdDoor = new Door();
        initialization();
    }
    public void initialization(){
        int number = getRandomNumber(1,4);
        switch (number) {
            case (1) -> {
                firsDoor.setPrize(true);
                secondDoor.setPrize(false);
                thirdDoor.setPrize(false);
            }
            case (2) -> {
                firsDoor.setPrize(false);
                secondDoor.setPrize(true);
                thirdDoor.setPrize(false);
            }
            case (3) -> {
                firsDoor.setPrize(false);
                secondDoor.setPrize(false);
                thirdDoor.setPrize(true);
            }
        }
    }

    public void openTheDoor(){
        int choice = person.makeChoice();
        System.out.println(person.getName() + choiceMassage + choice);
        switch (choice) {
            case (1) -> {
                if(firsDoor.isPrize()){
                    System.out.println(massageForWin);
                } else {
                    System.out.println(massageForLose);
                }
            }
            case (2) -> {
                if(secondDoor.isPrize()){
                    System.out.println(massageForWin);
                } else {
                    System.out.println(massageForLose);
                }
            }
            case (3) -> {
                if(thirdDoor.isPrize()){
                    System.out.println(massageForWin);
                } else {
                    System.out.println(massageForLose);
                }
            }
        }
    }

    public void checkTheDoor(Door door){
        if(door.isPrize()){
            System.out.println(massageForWin);
        } else {
            System.out.println(massageForLose);
        }
    }
}
