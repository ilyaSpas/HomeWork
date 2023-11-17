package org.example;

public class Lets_Make_a_Deal {
    private Level level;
    private Person person;
    private int rounds;
    public Lets_Make_a_Deal(int rounds){
        this.rounds = rounds;
        this.person = new Person("Иван");
    }
    public void start() throws InterruptedException {
        System.out.println("В игре будет " + rounds + " раундов.");
        Thread.sleep(500);

        for (int i = 0; i < rounds; i++) {
            this.level = new Level(person);
            level.openTheDoor();
        }

        System.out.println(person.getName() + " за игру,\n" +
                "Выбрал верную дверь " + person.getRoundWin() + " раз.\n" +
                "Ошибся " + person.getRoundLose() + ".");
    }
}
