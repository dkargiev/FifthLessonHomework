package com.company;

public class Main {

    public static void main(String[] args) {
        Book[] book = new Book[8];
        book[0] = new Book("Страх и отвращение в Лас-Вегасе", "Томпсон", 1, 10);
        book[1] = new Book("ЛСД - мой трудный ребенок", "Альберт Хофманн");
        book[2] = new Book(2, 10);
        book[3] = new Book("Говард Лавкрафт", 3);

        Reader reader = new Reader();
        Book selectedBook = reader.choiceBook(book);
        reader.readBook(selectedBook);
        reader.bookRating(selectedBook);
    }
}
