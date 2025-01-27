package com.lld.designpatterns.factoryDesignPattern.components.dropdown;

public class AndroidDropDown implements DropDown {

    @Override
    public void showDropDown() {
        System.out.println("androidDropDown showing ");
    }

    @Override
    public void collapseDropDown() {
        System.out.println("androidDropDown collapsed ");
    }
}
