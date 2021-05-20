package com.kodilla.testing.library;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Test
    void testListBooksWithConditionsReturnList() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);//

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    void testListBooksWithConditionMoreThan20() {
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }


    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        Mockito.verify(libraryDatabaseMock, Mockito.times(0)).listBooksWithCondition(anyString());
    }

    // Test with method listBooksInHandsOf(LibraryUser libraryUser)

    @Test
    void testListBooksInHandsOf() {
        // Given
        LibraryUser user1 = new LibraryUser("Dawid","Marek", "2340957493");
        LibraryUser user2 = new LibraryUser("Adrian","Olek", "0964758382");
        LibraryUser user3 = new LibraryUser("Mateusz","Mirek", "609137535");

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> userHasZeroBooksBorrowed = generateListOfNBooks(0);
        BookLibrary bookLibrary2 = new BookLibrary(libraryDatabaseMock);
        List<Book> userHasOneBooksBorrowed = generateListOfNBooks(1);
        BookLibrary bookLibrary3 = new BookLibrary(libraryDatabaseMock);
        List<Book> userHasFiveBooksBorrowed = generateListOfNBooks(5);

        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(userHasZeroBooksBorrowed);
        when(libraryDatabaseMock.listBooksInHandsOf(user2)).thenReturn(userHasOneBooksBorrowed);
        when(libraryDatabaseMock.listBooksInHandsOf(user3)).thenReturn(userHasFiveBooksBorrowed);
        // When
        List<Book> theListUserHasZeroBooksBorrowed = bookLibrary.listBooksInHandsOf(user1);
        List<Book> theListUserHasOneBooksBorrowed = bookLibrary2.listBooksInHandsOf(user2);
        List<Book> theListUserHasFiveBooksBorrowed = bookLibrary3.listBooksInHandsOf(user3);
        // Then
        assertEquals(0, theListUserHasZeroBooksBorrowed.size());
        assertEquals(1, theListUserHasOneBooksBorrowed.size());
        assertEquals(5, theListUserHasFiveBooksBorrowed.size());
    }


}