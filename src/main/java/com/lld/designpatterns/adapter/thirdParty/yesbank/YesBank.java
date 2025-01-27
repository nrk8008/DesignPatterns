package com.lld.designpatterns.adapter.thirdParty.yesbank;

public class YesBank {
 public void transferMoney(int amount, String to, String from){
     System.out.println("Transferring money via YesBank");
     System.out.println("Making payment to " + to + " from " + from + " with amount " + amount);
 }
}
