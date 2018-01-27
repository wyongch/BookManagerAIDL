// BookManager.aidl
package com.example.user.bookmanageraidl;

// Declare any non-default types here with import statements
import com.example.user.bookmanageraidl.Book;

interface BookManager {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */

    List<Book> getBooks();
    void addBook(in Book book);
}
