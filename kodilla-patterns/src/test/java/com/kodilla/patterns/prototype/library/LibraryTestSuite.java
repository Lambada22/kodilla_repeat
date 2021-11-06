package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() throws CloneNotSupportedException {
        //Given
//        Book book1 = new Book("Potop", "Sienkiewicz", LocalDate.of(1901, 2, 2));
//        Book book2 = new Book("Biblia", "Duch Święty", LocalDate.of(0, 1, 1));
//        Book book3 = new Book("Kroniki Polskie", "Gal Anonim", LocalDate.of(1230, 4, 4));
//
//
//        Library library = new Library("Fantasy");
//        library.getBooks().add(book1);
//        library.getBooks().add(book2);
//        library.getBooks().add(book3);

        Library library = new Library("Fantasy");
        for (int i = 0; i < 5; i++) {
            library.getBooks().add(new Book("title1", "Writer X", LocalDate.of(1990, 1, 2)));
        }

        Book booksByY = new Book("Title2 ", "Writer Y", LocalDate.of(2022, 12, 12));
        library.getBooks().remove(booksByY);

        //When

        //making a shallow copy
        Library clonedLibrary = null;
        clonedLibrary = library.shallowCopy();

        //making a deep cpy
        Library deepClonedLibrary = null;
        deepClonedLibrary = library.deepCopy();

        //Then
        assertEquals(clonedLibrary, library);
        assertEquals(deepClonedLibrary, library);

    }
}
