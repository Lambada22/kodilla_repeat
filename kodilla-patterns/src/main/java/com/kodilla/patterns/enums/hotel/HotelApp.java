package com.kodilla.patterns.enums.hotel;

public class HotelApp {
   // public static void main(String[] args) {
//        System.out.println("Accomodation  prices: ");
//        System.out.println("   - low season: " + PriceList.getSingleBedPrices("LOW"));
//        System.out.println("   - high season: " + PriceList.getSingleBedPrices("HIGH"));
//        System.out.println("   - holiday season: " + PriceList.getSingleBedPrices("HOLIDAY"));
//        System.out.println("2. Double Bed rooms ");
//        System.out.println("   - low season: " + PriceList.getDoubleBedPrices("LOW"));
//        System.out.println("   - high season: " + PriceList.getDoubleBedPrices("HIGH"));
//        System.out.println("   - holiday season: " + PriceList.getDoubleBedPrices("HOLIDAY"));
//    }

//    public static void main(String[] args) {
//        System.out.println("Accomodation prices: ");
//        System.out.println("1. Single Bed rooms ");
//        System.out.println("   - low season: " + PriceList.getSingleBedPrices(Season.LOW));
//        System.out.println("   - high season: " + PriceList.getSingleBedPrices(Season.HIGH));
//        System.out.println("   - holiday: " + PriceList.getSingleBedPrices(Season.HOLIDAY));
//        System.out.println("2. Double Bed rooms");
//        System.out.println("    - low season: " + PriceList.getDoubleBedPrice(Season.LOW));
//        System.out.println("    - high season: " + PriceList.getDoubleBedPrice(Season.HIGH));
//        System.out.println("    - Holiday: " + PriceList.getDoubleBedPrice(Season.HOLIDAY));
//    }

    public static void main(String[] args) {
        System.out.println("Accomodation prices: ");
        System.out.println("1. Single Bed rooms ");
        System.out.println("   - low season: " + Season.LOW.getSingleRoomPrice());
        System.out.println("   - high season: " + Season.HIGH.getSingleRoomPrice());
        System.out.println("   - holiday: " + Season.HOLIDAY.getSingleRoomPrice());
        System.out.println("2. Double Bed rooms");
        System.out.println("    - low season: " + Season.LOW.getDoubleRoomPrice());
        System.out.println("    - high season: " + Season.HIGH.getDoubleRoomPrice());
        System.out.println("    - Holiday: " + Season.HOLIDAY.getDoubleRoomPrice());

        Season season = Season.HOLIDAY;

        System.out.println(season);
    }
}
