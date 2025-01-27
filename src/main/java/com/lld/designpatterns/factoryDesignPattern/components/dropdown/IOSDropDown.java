package com.lld.designpatterns.factoryDesignPattern.components.dropdown;

public class IOSDropDown implements DropDown{

    @Override
    public void showDropDown() {
        System.out.println("Showing IOS Drop Down");
    }

    @Override
    public void collapseDropDown() {
        System.out.println("Collapsed IOS Drop Down");
    }
}
