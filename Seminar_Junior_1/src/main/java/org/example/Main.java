package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var books = new ArrayList<Book>();
        books.add(new Book("Преступление и наказание", "DOstoevskiy", 1866));
        books.add(new Book("Evgeniy Onegin", " Pushkin", 1833));
        books.add(new Book("Peace and War", "Tolstoy", 1869));
        books.add(new Book("Master and Margery", "Bulgakov", 1967));
        books.add(new Book("Priklychenie psa", "Unknown", 2000));
        books.add(new Book("Book1", "Pushkin", 1833));

        List<Book> list = books.stream().filter(book -> "Unknown".equals(book.getAuthor())).toList();
        List<Book> list1 = books.stream().filter(book -> book.getYear() > 1900).toList();
        List<String> list2 = books.stream().map(Book::getTitle).distinct().toList();

        System.out.println(list2);

    }
}
