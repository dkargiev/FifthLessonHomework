package com.company;

public final class Book extends Reader {
    final String name;
    final String author;
    final int serialNumberInTheSeries;
    final int numberOfPages;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", serialNumberInTheSeries=" + serialNumberInTheSeries +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public Book(String name, String author, int serialNumberInTheSeries, int numberOfPages) {
        this.name = name;
        this.author = author;
        this.serialNumberInTheSeries = serialNumberInTheSeries;
        this.numberOfPages = numberOfPages;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.serialNumberInTheSeries = 0;
        this.numberOfPages = 0;
    }

    public Book(int serialNumberInTheSeries, int numberOfPages) {
        this.serialNumberInTheSeries = serialNumberInTheSeries;
        this.numberOfPages = numberOfPages;
        this.name = "";
        this.author = "";
    }

    public Book(String author, int serialNumberInTheSeries) {
        this.author = author;
        this.serialNumberInTheSeries = serialNumberInTheSeries;
        this.name = "";
        this.numberOfPages = 0;
    }
}
