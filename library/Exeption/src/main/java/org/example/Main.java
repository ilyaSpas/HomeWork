package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        try{
            foo();
        } catch (MyException e){
            e.printStackTrace();
        }
    }

    public static void foo() throws InterruptedException, MyException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(i);
            if (i == 3) {
                throw new MyException("i = 3");
            }
        }
    }

}