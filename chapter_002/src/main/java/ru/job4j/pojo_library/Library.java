package ru.job4j.pojo_library;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("book0", 10);
        books[1] = new Book("book1", 10);
        books[2] = new Book("Clean code", 10);
        books[3] = new Book("book3", 10);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCount());
        }
        System.out.println("-------------------------------------------");

        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;

        for (Book book: books) {
            System.out.println(book.getName() + " " + book.getCount());
        }
        System.out.println("-------------------------------------------");

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println("Ячейка " + i + " "
                        + books[i].getName() + " " + books[i].getCount());
            }
        }
    }
}
