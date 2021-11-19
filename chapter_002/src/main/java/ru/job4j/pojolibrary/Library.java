package ru.job4j.pojolibrary;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("book0", 10);
        books[1] = new Book("book1", 10);
        books[2] = new Book("Clean code", 10);
        books[3] = new Book("book3", 10);

        for (Book book: books) {
            System.out.println(book.getName() + " " + book.getCount());
        }
        System.out.println("-------------------------------------------");

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (Book book: books) {
            System.out.println(book.getName() + " " + book.getCount());
        }
        System.out.println("------------------------------------------");

        for (Book book: books) {
            if (("Clean code").equals(book.getName())) {
                System.out.println(book.getName() + " " + book.getCount());
            }
        }
    }
}
