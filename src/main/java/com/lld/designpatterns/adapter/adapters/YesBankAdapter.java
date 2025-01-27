package com.lld.designpatterns.adapter.adapters;

import com.lld.designpatterns.adapter.thirdParty.yesbank.YesBank;

public class YesBankAdapter implements BankAPI{

    private YesBank yesBank;
    public YesBankAdapter(YesBank yesBank) {
        this.yesBank = yesBank;
    }

    @Override
    public void sendMoney(String from, String to, int amount) {
        yesBank.transferMoney(amount, to, from);
    }

    @Override
    public void registerAccount(String accountNumber) {

    }

    @Override
    public long getBalance(String accountNumber) {
        return 0;
    }
}
