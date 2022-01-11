package main;

import main.Client;

public class ClientFacade {
    public static String verifyHasCoupon(Client client){
        if(ItalianFoodRestaurant.getInstance().verifyClientHasCoupon(client)){
            return "ItalianFood";
        }
        if(JapaneseFoodRestaurant.getInstance().verifyClientHasCoupon(client)){
            return "JapaneseFood";
        }
        return "Coupon Not found";
    }
}
