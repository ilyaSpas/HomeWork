package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var books = new ArrayList<Book>();
        books.add(new Book("Преступление и наказание", "DOstoevskiy", 1866));
        books.add(new Book("Evgeniy Onegin", " Pushkin", 1833));
        books.add(new Book("Peace and War", "Tolstoy", 1869));
        books.add(new Book("Master and Margery", "Bulgakov", 1967));
        books.add(new Book("Priklychenie psa", "Unknown", 2000));
        books.add(new Book("Book1", "Pushkin", 1833));
    }
}
