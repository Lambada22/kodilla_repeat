package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.portal.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User mark = new Millenials("Mark Z.");
        User lawyer = new YGeneration("Zbigniew Ziobero");
        User najka = new ZGeneration("Wierząca Natalia");

        //When
        String portalOfMark = mark.sharePost();
        System.out.println("Portal of Mark is: " + portalOfMark);

        String portalOfZero = lawyer.sharePost();
        System.out.println("Portal of Zibi is: " + portalOfZero);

        String portalNajki = najka.sharePost();
        System.out.println("Portal Najeczki to: " + portalNajki);

        //Then
        assertEquals("This is Facebook!", portalOfMark);
        assertEquals("This is Twitter", portalOfZero);
        assertEquals("This is Snapchat!", portalNajki);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User random = new Millenials("Niejaki Joe");

        //When
        String portalOfOurUser = random.sharePost();
        System.out.println("Joe-go portal to: " + portalOfOurUser);
        random.setSocialPublisher(new TwitterPublisher());
        System.out.println("    ///////CHANGE IN PROGRESS////////");
        portalOfOurUser = random.sharePost();
        System.out.println("Joe Changed his favourite portal to: " + portalOfOurUser);

        //Then
        assertEquals("This is Twitter", portalOfOurUser);

    }
}
