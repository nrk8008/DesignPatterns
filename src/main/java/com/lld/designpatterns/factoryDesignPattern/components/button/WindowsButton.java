package com.lld.designpatterns.factoryDesignPattern.components.button;

public class WindowsButton implements Button{


    @Override
    public void showButton() {
        System.out.println("Showing windows Button");
    }

    @Override
    public void clickButton() {
        System.out.println("Clicking windows Button");
    }
}
