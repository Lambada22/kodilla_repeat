package com.kodilla.stream.reference;

public class FunctionalStyling {
    public static String withABC(String myPoem) {
        String abc = "ABC";
        return abc + " " + myPoem + abc;
    }

    public static String anotherStyle(String myPoem) {
        String howLong = String.valueOf(myPoem.length());
        return myPoem + " ma długość: " + howLong;
    }

}
