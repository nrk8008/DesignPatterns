package com.lld.designpatterns.adapter.adapters;

public class PhonePe {
    private static BankAPI bankAPI = new ICICIAdapter();

    public static void main(String[] args) {
        bankAPI.sendMoney("1234", "8008", 1000000);
    }
}
