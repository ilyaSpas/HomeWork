package org.example;

import static org.example.Utils.getRandomNumber;

public class Level {
    private Door firsDoor;
    private Door secondDoor;
    private Door thirdDoor;
    private Person person;
    private final String massageForWin = "И он выйгрывает автомобиль!\n";
    private final String massageForLose = "и за дверью находится коза...\n";
    private final String choiceMassage = " выбирает дверь номер №";
    private final String offerMassage1 = " принимает предложение Монти и открывает дверь №";
    private final String offerMassage2 = " отказывается от предложения Монти и открывает дверь №";
    private final String offerMassage3 = "Монти предлагает выбрать дверь №";

    public Level(Person person) {
        this.person = person;
        firsDoor = new Door();
        secondDoor = new Door();
        thirdDoor = new Door();
        initialization();
    }

    public void initialization() {
        int number = getRandomNumber(1, 4);
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

    public void openTheDoor() {
        int choice = person.makeChoice();
        System.out.println(person.getName() + choiceMassage + choice);
        int offer = montyOffer(choice);
        System.out.println(offerMassage3 + offer);
        choice = thinking(offer, choice);

        switch (choice) {
            case (1) -> checkTheDoor(firsDoor);
            case (2) -> checkTheDoor(secondDoor);
            case (3) -> checkTheDoor(thirdDoor);
        }
    }

    private int thinking(int offer, int choice) {
        int newChoice = getRandomNumber(1,3);
        if (newChoice == 1){
            System.out.println(person.getName() + offerMassage1 + offer);
            return offer;
        } else {
            System.out.println(person.getName() + offerMassage2 + choice);
            return choice;
        }
    }

    public void checkTheDoor(Door door) {
        if (door.isPrize()) {
            person.win();
            System.out.println(massageForWin);
        } else {
            System.out.println(massageForLose);
            person.lose();
        }
    }

    private int montyOffer(int choice){
        int offer =  getRandomNumber(1,4);
        while (offer == choice){
            offer =  getRandomNumber(1,4);
        }
        return offer;
    }
}
