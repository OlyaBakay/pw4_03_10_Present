package com.bakay;

// import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Present present = new Present();
        Oreo oreo1 = new Oreo(10, 15 ,2, "strawberry Oreo");
        Oreo oreo2 = new Oreo(10, 20, 3, "chocolate Oreo");
        MilkyWay milkyWay1 = new MilkyWay(11, 29, 9, "MilkiWay with strawberries");
        MilkyWay milkyWay2 = new MilkyWay(11, 15, 3,"MilkiWay original");
        present.addCandy(oreo1, oreo2, milkyWay1, milkyWay2);

        System.out.println(present.getWeightOfBasket());
        System.out.println(present.getCandiesInRange(0, 10));
        System.out.println(present.showPresent());

        present.sortCandy();
        System.out.println(present.showPresent());
    }}
