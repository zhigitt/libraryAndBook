package service;

import models.Book;

public interface BookService {
    void addBook (Book book);
    void removeBook(String ISBN);
    void searchBook(String keyWorld);
    void displayBooks();
}
