package com.kodilla.patterns.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library>{

    final String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
        return super.clone();
    }

    public Library deepCopy() throws  CloneNotSupportedException{
        Library cloneLibrary = super.clone();
        cloneLibrary.books = new HashSet<>();
        for(Book theListBook: books) {
            Book cloneBook = new Book(theListBook.getAuthor(), theListBook.getTitle(), theListBook.getPublicationDate());
            cloneBook.toString();
        }
        return  cloneLibrary;
    }
}
