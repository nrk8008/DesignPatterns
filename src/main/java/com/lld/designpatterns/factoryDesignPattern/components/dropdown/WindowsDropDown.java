package com.lld.designpatterns.factoryDesignPattern.components.dropdown;

public class WindowsDropDown implements DropDown{


    @Override
    public void showDropDown() {
        System.out.println("showing Windows Drop Down");
    }

    @Override
    public void collapseDropDown() {
        System.out.println("collapsed Windows Drop Down");
    }
}
