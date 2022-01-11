package main;

public class ItalianFoodRestaurant extends Restaurant {

    private static ItalianFoodRestaurant restaurant = new ItalianFoodRestaurant();

    private ItalianFoodRestaurant(){};

    public static ItalianFoodRestaurant getInstance(){
        return restaurant;
    }

}
