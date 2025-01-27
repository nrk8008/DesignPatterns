package com.lld.designpatterns.factoryDesignPattern.components.button;

public class IOSButton implements Button {

    @Override
    public void showButton() {
        System.out.println("showing IOS Button");

    }

    @Override
    public void clickButton() {
    System.out.println("clicking IOS Button");
    }


}
