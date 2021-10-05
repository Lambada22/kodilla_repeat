//package com.kodilla.stream.world;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class WorldTestSuite {
//    @Test
//    void testGetPeopleQuantity(){
//        //Given
//        Country uK= new Country("UK",new BigDecimal(100000000));
//        Country poland= new Country("Poland",new BigDecimal(38000000));
//        Country germany= new Country("Germany",new BigDecimal(58000000.0));
//
//        Country japan=new Country("Japan",new BigDecimal(20000000));
//        Country korea=new Country("Korea", new BigDecimal(2090999));
//        Country kazachstan=new Country("Kazachstan", new BigDecimal(78868686));
//
//        Country egipt= new Country("Egypt", new BigDecimal(100000000));
//        Country nygeria= new Country("Nygeria", new BigDecimal(58000000));
//        Country southAfrica= new Country("SouthAfrica", new BigDecimal(250000000));
//
//        // When
//        List<Country> europeCountries=new LinkedList<>();
//        europeCountries.add(uK);
//        europeCountries.add(poland);
//        europeCountries.add(germany);
//        Continent europe= new Continent(europeCountries,"Europe");
//
//        List<Country> asia=new LinkedList<>();
//        asia.add(japan);
//        asia.add(korea);
//        asia.add(kazachstan);
//
//        List<Country> africa=new LinkedList<>();
//        africa.add(egipt);
//        africa.add(nygeria);
//        africa.add(southAfrica);
//
//        Continent europeContinent=new Continent(europeCountries,"Europe");
//        Continent asiaContinent=new Continent(asia,"Asia");
//        Continent africaContinent=new Continent(africa,"Africa");
//
//        List<Continent>continentList=new LinkedList<>();
//        continentList.add(europeContinent);
//        continentList.add(asiaContinent);
//        continentList.add(africaContinent);
//
//        World world=new World(continentList);
//        world.addContinent(europeContinent);
//        world.addContinent(africaContinent);
//        world.addContinent(asiaContinent);
//
//        BigDecimal totalAmountOFThePeople= world.getPeopleQuantity();
//
//        BigDecimal a=new BigDecimal(BigInteger.ZERO);
//        BigDecimal i=new BigDecimal(BigInteger.ZERO);
//        for (Continent www:continentList){
//            a=a.add(continentList.get(n))
//
//        }
//
//        //Then
//        //assertEquals(totalAmountOFThePeople,);
//    }
//}
