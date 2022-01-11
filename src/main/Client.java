package main;

public class Client {

    public String useCoupon(){
        return ClientFacade.verifyHasCoupon(this);
    }

}
