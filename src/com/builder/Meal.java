package com.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siddharth on 2/17/2016.
 */
public class Meal {
    private List<Item> items= new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public void showItems(){
        for (Item item:items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item:items) {
            cost+=item.price();
        }
        return cost;
    }
}
