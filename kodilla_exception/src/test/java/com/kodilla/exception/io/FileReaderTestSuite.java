package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFile(){
        //Given
        FileReader fileReader=new FileReader();
        //when&then
        //assertDoesNotThrow(()-> fileReader.readFile(file));
    }

    @Test
    void whenFileDoesntExistsFileShouldThrowException(){
        //Given
        FileReader fileReader=new FileReader();
        String fileName="nie_ma_takiego_pliu.txt";
        //when&then
        assertThrows(FileReaderException.class,()->fileReader.readFile(fileName));
    }

    @Test
    void testRadFileWithName(){
        //Given
        FileReader fileReader=new FileReader();
        //When & then
        assertAll(
                ()->assertThrows(FileReaderException.class,()->fileReader.readFile("labidabida")),
                ()-> assertThrows(FileReaderException.class, ()-> fileReader.readFile(null)),
                ()->assertDoesNotThrow(()->fileReader.readFile("names.txt"))

        );
    }
}
