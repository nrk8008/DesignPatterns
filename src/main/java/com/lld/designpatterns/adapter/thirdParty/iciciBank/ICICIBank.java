package com.lld.designpatterns.adapter.thirdParty.iciciBank;

public class ICICIBank {
    public void makePayment(String to, String from, int amount){
        System.out.println("making payment via ICICI Bank");
        System.out.println("Making payment to " + to + " from " + from + " with amount " + amount);
    }
}
