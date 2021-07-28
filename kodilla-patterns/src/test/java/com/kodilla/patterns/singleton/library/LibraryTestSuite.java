package com.kodilla.patterns.singleton.library;

import com.kodilla.patterns.library.Book;
import com.kodilla.patterns.library.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Book books = new Book("Kombinacje M.Blocha", "M.Bloch", LocalDate.of(2014, 1, 9));
        IntStream.iterate(1, a -> 1 + a)
                .limit(1)
                .forEach(a -> books.toString());

        Library library = new Library("Project number 1");
        library.getBooks().add(books);

        // shallowCopy
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deepCopy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        //Then
        assertEquals("Kombinacje M.Blocha",books.getTitle());
        assertEquals("M.Bloch", books.getAuthor());
        assertEquals(LocalDate.of(2014, 1, 9), books.getPublicationDate());
        assertEquals(1, library.getBooks().size());
        assertEquals(1,shallowClonedLibrary.getBooks().size());
        assertEquals(shallowClonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());

    }
}
