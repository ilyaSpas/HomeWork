package org.example;

public class Hero extends GameObject {


    public Hero(int maxHealthPoint, int maxManaPoint) {

        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
        magic = true;

    }




    // FIXME: 29.06.2023 Дописать нужное
}
