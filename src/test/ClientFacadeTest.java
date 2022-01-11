package test;

import main.Client;
import main.ItalianFoodRestaurant;
import main.JapaneseFoodRestaurant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientFacadeTest {

    @Test
    void sholdBeReturnItalianFood(){
        Client client = new Client();
        ItalianFoodRestaurant.getInstance().addClientWithCoupon(client);

        assertEquals("ItalianFood", client.useCoupon());
    }

    @Test
    void sholdBeReturnJapaneseFood(){
        Client client = new Client();
        JapaneseFoodRestaurant.getInstance().addClientWithCoupon(client);

        assertEquals("JapaneseFood", client.useCoupon());
    }

    @Test
    void sholdBeReturnNotFoundCoupon(){
        Client client = new Client();

        assertEquals("Coupon Not found", client.useCoupon());
    }
}