package com.bakay;

public class Oreo extends Candy{
        protected String geo;

        public Oreo(double price, int weight, double sugar, String color) {
            super(price, weight, sugar, color);
        }

        public void fromCountry(String geo){
            this.geo = geo;
        }
    }