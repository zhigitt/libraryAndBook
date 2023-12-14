package service.impl;

import models.Book;
import models.Library;
import service.BookService;

public class BookServiceImpl implements BookService {
    Library library;

    public BookServiceImpl(Library library) {
        this.library = library;
    }

    @Override
    public void addBook(Book book) {
        library.books.put(book.getISBN(), book);
        System.out.println("Kitep koshuldu");
    }

    @Override
    public void removeBook(String ISBN) {
        if (library.books.containsKey(ISBN)){
            library.books.remove(ISBN);
            System.out.println("Kitep ochuruldu");
        }else {
            System.out.println("Myndai kitep jok");
        }
    }

    @Override
    public void searchBook(String keyWorld) {
        if (library.books.containsKey(keyWorld)){
            System.out.println(library.books);
        }
    }

    @Override
    public void displayBooks() {
        System.out.println(library.books.toString());
    }
}
