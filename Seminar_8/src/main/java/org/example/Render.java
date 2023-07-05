package org.example;

public class Render {
    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    public void showIndicator(GameObject gameObject) {
        // Не должно быть упоминания конкретных классов!!!
        System.out.println("Текущее здоровье: " + gameObject.getCurrentHealth() +
                "\nМаксимальное здоровье: " + gameObject.getMaximalHealth());
        if (gameObject.magic){
            System.out.println("Текущая мана: " + gameObject.getCurrentMana() +
                    "\nМаксимальное значение маны: " + gameObject.maxManaPoint);
        }
    }

}
