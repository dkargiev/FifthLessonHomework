package com.company;

import java.util.Random;

public class Reader {

    final Book choiceBook(Book[] book) {
        Random random = new Random();
        int randomNumberForBook = random.nextInt(book.length);
        return book[randomNumberForBook];
    }

    final void readBook(Book book) {
        String randomBook = book.toString();
        System.out.println(randomBook);
    }

    final void bookRating(Book book) {
        int rating = book.name.length() +
                book.author.length() +
                book.serialNumberInTheSeries +
                book.numberOfPages;

        Random random = new Random();
        int randomNumberForRating = random.nextInt(10);

        if (book.name.length() == 0) {
            rating = rating - randomNumberForRating;
        }
        if (book.author.length() == 0) {
            rating = rating - randomNumberForRating;
        }
        if (book.serialNumberInTheSeries == 0) {
            rating = rating - randomNumberForRating;
        }
        if (book.numberOfPages == 0) {
            rating = rating - randomNumberForRating;
        }

        System.out.println("Рейтинг книги: " + rating + "; " + "Название: " + book.name);
    }
}
