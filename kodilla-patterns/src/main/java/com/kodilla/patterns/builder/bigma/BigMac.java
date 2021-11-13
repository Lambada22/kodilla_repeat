package com.kodilla.patterns.builder.bigma;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigMac {
    private final boolean bun;
    private final boolean roll;
    private final int burgers;
    private List<String> sauce;
    private List<String> ingredients;

    public static class BigMacBuilder {
        private boolean bun;
        private boolean roll;
        private int burgers;
        private List<String> sauces = new ArrayList<>();
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(boolean bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder roll(boolean roll) {
            this.roll = roll;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            sauces.add(sauce);
            return this;
        }

        public BigMacBuilder ingredients(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(bun, roll, burgers, sauces, ingredients);
        }
    }

    public BigMac(boolean bun, boolean roll, int burgers, List<String> sauce, List<String> ingredients) {
        this.bun = bun;
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    //    private BigMac(String bun, String roll, int burgers, List<String> sauce, List<String> ingredients) {
//        this.bun = bun;
//        this.roll = roll;
//        this.burgers = burgers;
//        this.sauce = new ArrayList<>(sauce);
//        this.ingredients = new ArrayList<>(ingredients);
//    }
//
//    public BigMac(final String bun, final String roll, final int burgers, final List<String> sauce, final List<String> ingredients) {
//        this.bun = bun;
//        this.roll = roll;
//        this.burgers = burgers;
//        this.sauce = sauce;
//        this.ingredients.addAll(Arrays.asList(ingredients));
//    }

    public boolean getBun() {
        return bun;
    }

    public boolean getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}


