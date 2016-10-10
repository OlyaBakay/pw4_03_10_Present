package com.bakay;

public class MilkyWay extends Candy {
    protected String taste;

    public MilkyWay(double price, int weight, double sugar, String color) {
        super(price, weight, sugar, color);
    }

    public void tasteOf(String taste){
        this.taste = taste;
    }
}
