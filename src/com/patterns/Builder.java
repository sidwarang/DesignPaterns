package com.patterns;

import com.builder.Meal;
import com.builder.MealBuilder;

/**
 * Created by Siddharth on 2/17/2016.
 */
public class Builder {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Veg Meal:");
        vegMeal.showItems();
        System.out.println("Total cost: " + vegMeal.getCost());
        System.out.println("Non-Veg Meal:");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());
    }
}
