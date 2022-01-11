package main;

import main.Client;

import java.util.ArrayList;
import java.util.List;

public abstract class Restaurant {

    private List<Client> clientWithCoupon = new ArrayList<Client>();

    public void addClientWithCoupon(Client client){
        this.clientWithCoupon.add(client);
    }

    public boolean verifyClientHasCoupon(Client client){
        return this.clientWithCoupon.contains(client);
    }



}
