import models.Book;
import models.Library;
import service.BookService;
import service.impl.BookServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Library library = new Library();
        BookService bookService = new BookServiceImpl(library);


        Book book1 = new Book("1", "Alippe", "Urmat");
        Book book2 = new Book("2", "Java", "Ajybek");
        Book book3 = new Book("3", "JS", "Aliskar");
        Book book4 = new Book("4", "C#", "Nurtaazim");
        Book book5 = new Book("5", "C++", "Nurkamil");


        Library.books.put(book1.getISBN(), book1);
        Library.books.put(book2.getISBN(), book2);
        Library.books.put(book3.getISBN(), book3);
        Library.books.put(book4.getISBN(), book4);
        Library.books.put(book5.getISBN(), book5);

        while (true) {
            System.out.println("""
                    1. add book
                    2. remove book
                    3. search book
                    4. display books
                    """);
            System.out.print("Select: ");

            switch (sc.nextInt()) {
                case 1 -> {
                    bookService.addBook(new Book("6", "Kotlin", "Aiturgan"));
                }
                case 2 -> {
                    System.out.print("ISBN book: ");
                    String isbn = sc1.nextLine();

                    bookService.removeBook(isbn);
                }
                case 3 -> {
                    System.out.print("ISBN book: ");
                    String isbn = sc1.nextLine();

                    bookService.searchBook(isbn);
                }
                case 4 -> {
                    bookService.displayBooks();
                }
            }
        }
    }

}
