package com.lld.designpatterns.adapter.adapters;

public interface BankAPI {
    void sendMoney(String from, String to, int amount);
    void registerAccount(String accountNumber);
    long getBalance(String accountNumber);
}
