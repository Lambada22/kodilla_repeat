package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class Continent {
    private final List<Country> countries;

    private final String continent;

    public Continent(final List<Country> countries, final String continent) {
        this.countries = countries;
        this.continent = continent;
    }


    public  void addCountry(Country country){
        countries.add(country);
    }

    public String getContinent() {
        return continent;
    }

    public  boolean removeCountry(Country country){
        return countries.remove(country);
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "countries=" + countries +
                ", continent='" + continent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;

        Continent continent1 = (Continent) o;

        if (countries != null ? !countries.equals(continent1.countries) : continent1.countries != null) return false;
        return continent != null ? continent.equals(continent1.continent) : continent1.continent == null;
    }

    @Override
    public int hashCode() {
        return continent != null ? continent.hashCode() : 0;
    }

}
