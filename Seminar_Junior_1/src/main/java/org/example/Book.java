package org.example;

public class Book {

    //region Параметры
    private String title;
    private String author;
    private int year;
    //endregion

    //region Конструкторы
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }
    //endregion

    //region Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //endregion

    //region toString
    @Override
    public String toString() {
        return "Название книги: " + title +
                "\nАвтор: " + author +
                "\nГод выпуска: " + year;
    }
    //endregion
}
