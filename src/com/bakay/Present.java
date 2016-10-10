package com.bakay;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;

public class Present {

        protected ArrayList<Candy> allCandies = new ArrayList();
        private int weightOfBasket;

        public void addCandy(Candy... newCandies) {
            for (Candy c: newCandies)
            {
                allCandies.add(c);
                weightOfBasket += c.weight;
        }}


    public int getWeightOfBasket(){
        return this.weightOfBasket;
    }

    public ArrayList<Candy> getCandiesInRange(int s, int e){
        ArrayList<Candy> rangedList = new ArrayList<Candy>();
        for(Candy candy: allCandies){
            if (candy.sugar >= s && candy.sugar <= e){
                rangedList.add(candy);
            }
        }
        return rangedList;    }

    public void sortCandy(){
        Collections.sort(allCandies);
    }
    public ArrayList<Candy> showPresent(){
        return allCandies;
    }

}

