package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '*';
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static char[][] field;
    private static int fieldsSizeX;
    private static int fieldsSizeY;


    public static void main(String[] args) {
        Main game = new Main();
        game.start();

    }

    public static void initialize() {

        fieldsSizeX = 7;
        fieldsSizeY = 7;
        field = new char[fieldsSizeX][fieldsSizeX];

        for (int x = 0; x < fieldsSizeX; x++) {
            for (int y = 0; y < fieldsSizeY; y++) {
                field[x][y] = DOT_EMPTY;
            }
        }
    }

    public static void printField() {
        System.out.print("+");
        for (int x = 0; x < fieldsSizeX * 2 + 1; x++) {
            System.out.print((x % 2 == 0) ? "-" : x / 2 + 1);
        }
        System.out.println();

        for (int x = 0; x < fieldsSizeX; x++) {
            System.out.print(x + 1 + "|");
            for (int y = 0; y < fieldsSizeY; y++) {
                System.out.print(field[x][y] + "|");
            }
            System.out.println();
        }

        for (int x = 0; x < fieldsSizeX * 2 + 2; x++) {
            System.out.print("-");
        }
        System.out.println();

    }

    private static void humanTurn() {
        int x, y;

        do {

            while (true) {
                System.out.print("Введите координату хода X (от 1 до 3): ");
                if (scanner.hasNextInt()) {
                    x = scanner.nextInt() - 1;
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Некорректное число, повторите попытку ввода.");
                    scanner.nextLine();
                }
            }

            while (true) {
                System.out.print("Введите координату хода Y (от 1 до 3): ");
                if (scanner.hasNextInt()) {
                    y = scanner.nextInt() - 1;
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Некорректное число, повторите попытку ввода.");
                    scanner.nextLine();
                }
            }
        }
        while (!isCellValid(x, y) || !isCellEmpty(x, y));
        field[x][y] = DOT_HUMAN;
    }

    public static void AITurn() {
        int x1, y1;


        //справа от игрока
        for (int x = 0; x < fieldsSizeX; x++) {
            for (int y = 0; y < fieldsSizeY - 2; y++) {
                if (field[x][y] == DOT_HUMAN && field[x][y + 1] == DOT_HUMAN && field[x][y + 2] == DOT_EMPTY) {
                    if(y + 3 == fieldsSizeY){
                        continue;
                    }
                    field[x][y + 2] = DOT_AI;
                    return;
                }
            }
        }

        //слева от игрока
        for (int x = 0; x < fieldsSizeX; x++) {
            for (int y = 1; y < fieldsSizeY - 1; y++) {
                if (field[x][y] == DOT_HUMAN && field[x][y + 1] == DOT_HUMAN && field[x][y - 1] == DOT_EMPTY) {
                    if(y - 1 == 0){
                        continue;
                    }
                    field[x][y - 1] = DOT_AI;
                    return;
                }
            }
        }

        //слева-вверху от игрока
        for (int x = 1; x < fieldsSizeX - 1; x++) {
            for (int y = 1; y < fieldsSizeY - 1; y++) {
                if (field[x][y] == DOT_HUMAN && field[x + 1][y + 1] == DOT_HUMAN && field[x - 1][y - 1] == DOT_EMPTY) {
                    if(x == 1 && y == 1){
                        continue;
                    }
                    field[x - 1][y - 1] = DOT_AI;
                    return;
                }
            }
        }

        //справа-вверху от игрока
        for (int x = 1; x < fieldsSizeX - 1; x++) {
            for (int y = 1; y < fieldsSizeY - 1; y++) {
                if (field[x][y] == DOT_HUMAN && field[x + 1][y - 1] == DOT_HUMAN && field[x - 1][y + 1] == DOT_EMPTY) {
                    field[x - 1][y + 1] = DOT_AI;
                    return;
                }
            }
        }

        //справа-внизу от игрока
        for (int x = 1; x < fieldsSizeX - 1; x++) {
            for (int y = 1; y < fieldsSizeY - 1; y++) {
                if (field[x][y] == DOT_HUMAN && field[x - 1][y - 1] == DOT_HUMAN && field[x + 1][y + 1] == DOT_EMPTY) {
                    field[x + 1][y + 1] = DOT_AI;
                    return;
                }
            }
        }

        //слева-внизу от игрока
        for (int x = 1; x < fieldsSizeX - 1; x++) {
            for (int y = 1; y < fieldsSizeY - 1; y++) {
                if (field[x][y] == DOT_HUMAN && field[x - 1][y + 1] == DOT_HUMAN && field[x + 1][y - 1] == DOT_EMPTY) {
                    field[x + 1][y - 1] = DOT_AI;
                    return;
                }
            }
        }



        //сверху от игрока
        for (int x = 1; x < fieldsSizeX - 1; x++) {
            for (int y = 0; y < fieldsSizeY; y++) {
                if (field[x][y] == DOT_HUMAN && field[x + 1][y] == DOT_HUMAN && field[x - 1][y] == DOT_EMPTY) {
                    if(x == 1){
                        continue;
                    }
                    field[x - 1][y] = DOT_AI;
                    return;
                }
            }
        }


        //снизу от игрока
        for (int x = 0; x < fieldsSizeX - 1; x++) {
            for (int y = 0; y < fieldsSizeY; y++) {
                if (field[x][y] == DOT_HUMAN && field[x + 1][y] == DOT_HUMAN && field[x + 2][y] == DOT_EMPTY) {
                    if(x == fieldsSizeX - 1){
                        continue;
                    }
                    field[x + 2][y] = DOT_AI;
                    return;
                }
            }
        }

        do {

            x1 = random.nextInt(fieldsSizeX);
            y1 = random.nextInt(fieldsSizeY);

        } while (!isCellValid(x1, y1) || !isCellEmpty(x1, y1));
        field[x1][y1] = DOT_AI;
    }

    private static boolean checkWin(char c) {

//        if(field[0][0] == c && field[0][1] == c && field[0][2] == c) return true;
//        if(field[1][0] == c && field[1][1] == c && field[1][2] == c) return true;
//        if(field[2][0] == c && field[2][1] == c && field[2][2] == c) return true;
//
//        if(field[0][0] == c && field[1][0] == c && field[2][0] == c) return true;
//        if(field[0][1] == c && field[1][1] == c && field[2][1] == c) return true;
//        if(field[0][2] == c && field[1][2] == c && field[2][2] == c) return true;
//
//        if(field[0][0] == c && field[1][1] == c && field[2][2] == c) return true;
//        if(field[0][2] == c && field[1][1] == c && field[2][0] == c) return true;

        for (int x = 0; x < fieldsSizeX - 3; x++) {
            for (int y = 0; y < fieldsSizeY - 3; y++) {
                if (field[x][y] == c && field[x + 1][y] == c && field[x + 2][y] == c && field[x + 3][y] == c)
                    return true;
                if (field[x][y] == c && field[x][y + 1] == c && field[x][y + 2] == c && field[x][y + 3] == c)
                    return true;
                if (field[x][y] == c && field[x + 1][y + 1] == c && field[x + 2][y + 2] == c && field[x + 3][y + 3] == c)
                    return true;

                if (x >= 3 && y <= fieldsSizeY - 4) {
                    if (field[x][y] == c && field[x - 1][y + 1] == c && field[x - 2][y + 2] == c && field[x - 3][y + 3] == c)
                        return true;
                }
            }
        }

        return false;
    }

    public static boolean checkDraw() {
        for (int x = 0; x < fieldsSizeX; x++) {
            for (int y = 0; y < fieldsSizeY; y++) {
                if (isCellEmpty(x, y)) return false;
            }
        }
        return true;
    }


    public void start() {
        initialize();
        printField();

        while (true) {
            humanTurn();
            printField();
            if (checkGameState(DOT_HUMAN, "Вы победили!")) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            AITurn();
            printField();
            if (checkGameState(DOT_AI, "Вы проиграли!")) {
                break;
            }
        }
    }


    public static boolean checkGameState(char c, String str) {
        if (checkWin(c)) {
            System.out.println(str);
            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    public static boolean isCellEmpty(int x, int y) {
        return field[x][y] == DOT_EMPTY;
    }

    public static boolean isCellValid(int x, int y) {
        return x >= 0 && x < fieldsSizeX && y >= 0 && y < fieldsSizeY;
    }
}