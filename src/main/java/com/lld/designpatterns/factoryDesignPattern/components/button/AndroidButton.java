package com.lld.designpatterns.factoryDesignPattern.components.button;

public class AndroidButton implements Button {


    @Override
    public void showButton() {
        System.out.println("Showing android Button");
    }

    @Override
    public void clickButton() {
       System.out.println("Clicking android Button");
    }
}
