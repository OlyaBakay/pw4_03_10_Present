package com.bakay;

class Candy implements Comparable<Candy> {
    protected double price;
    protected int weight;
    protected double sugar;
    protected String color;

    public void setPrice(double price){
        this.price = price;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    private void setSugar(double sugar)
    {
        this.sugar = sugar;
    }

    public double getSugar(){
        return this.sugar;
    }

    public double getWeight(){
        return this.weight;
    }

    public double getPrice(){
        return this.price;
    }

    public Candy(double price, int weight, double sugar, String color){
        this.price = price;
        this.weight = weight;
        this.sugar = sugar;
        this.color = color;

    }
    @Override
    public int compareTo(Candy compareCandy){
        return this.weight - compareCandy.weight;
        }
    @Override
    public String toString(){
        return "Name: " + color + ", weight = " + weight;
    }
}