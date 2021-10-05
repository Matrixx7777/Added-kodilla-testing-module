package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest(){
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Dawid Kocik", "Student Of Bootcamp Kodilla", 2021, "Junior"));
        bookSet.add(new Book("Adrian Pazucha", "Mentor Kodilla", 2017, "Senior"));
        bookSet.add(new Book("Olek Malinowski", "Graduate", 2018, "Mid/Regular"));

        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2018,median);
    }
}
