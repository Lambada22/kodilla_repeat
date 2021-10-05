package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieIterator {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String movieStoreList = movieStore.getMovies().entrySet().stream()
                .flatMap(stringListEntry -> stringListEntry.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(movieStoreList);

    }
}
