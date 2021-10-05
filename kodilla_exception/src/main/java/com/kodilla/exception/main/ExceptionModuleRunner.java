package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.io.File;
import java.io.IOException;

public class ExceptionModuleRunner {
    public  static void main(String[] args) throws IOException, FileReaderException {
        FileReader fileReader = new FileReader();
        ClassLoader classLoader = ExceptionModuleRunner.class.getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());
        fileReader.readFile("file/names.txt");
        FileReaderWithoutHandling fileReaderWithoutHandling= new FileReaderWithoutHandling();
        fileReader.readFile(file.toString());
        try {
            fileReader.readFile(file.toString());
        }catch (FileReaderException e){
            System.out.println("Problem while reading a file!");
        }
    }
}
