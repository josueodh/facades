package main;

public class JapaneseFoodRestaurant extends Restaurant {
    private static JapaneseFoodRestaurant restaurant = new JapaneseFoodRestaurant();

    private JapaneseFoodRestaurant(){};

    public static JapaneseFoodRestaurant getInstance(){
        return restaurant;
    }
}
