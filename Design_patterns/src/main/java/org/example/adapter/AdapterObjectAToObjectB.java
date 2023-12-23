package org.example.adapter;

public class AdapterObjectAToObjectB extends ObjectA implements CommandForObjectB{

    @Override
    public void saveB() {
        createA();
    }

    @Override
    public void deleteB() {
        deleteA();
    }
}
