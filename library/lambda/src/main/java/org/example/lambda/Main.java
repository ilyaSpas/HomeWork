package org.example.lambda;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        TwoNumbers numbers = new TwoNumbers() {
//            @Override
//            public int action(int x, int y) {
//                return (x + y);
//            }
//        };

//        TwoNumbers numbers = (x, y) -> (x + y);
//        TwoNumbers numbers = Integer::sum;
//        TwoNumbers numbers = (x, y) -> Integer.compare(x,y);
        TwoNumbers numbers = Integer::compare;

        System.out.println(numbers.action(3, 4));
    }
}