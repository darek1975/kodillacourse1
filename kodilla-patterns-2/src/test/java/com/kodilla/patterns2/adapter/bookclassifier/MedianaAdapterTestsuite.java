package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianaAdapterTestsuite {
    @Test
    public void publicationYearMedian() {
        //given
        Book book1 = new Book("Piotr Nowak", "Siano", 2009, "245322");
        Book book2 = new Book("Jan Zieliński", "Gnój", 2002, "332113");
        Book book3 = new Book("Jarosław Ważny", "Mrowisko", 2011, "231345");
        Book book4 = new Book("Jan Jankowski", "Wózek", 2007, "131300");
        Book book5 = new Book("Marek Marecki", "Kasacja", 2003, "231987");
        Set<Book> books = new HashSet<>(Arrays.asList(book1, book2, book3, book4, book5));
        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        int median = medianAdapter.publicationYearMedian(books);
        //then
        assertEquals(2007, median);
    }
}
