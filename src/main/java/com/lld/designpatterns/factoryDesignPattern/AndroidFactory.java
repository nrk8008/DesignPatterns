package com.lld.designpatterns.factoryDesignPattern;

import com.lld.designpatterns.factoryDesignPattern.components.button.Button;
import com.lld.designpatterns.factoryDesignPattern.components.button.AndroidButton;
import com.lld.designpatterns.factoryDesignPattern.components.dropdown.AndroidDropDown;
import com.lld.designpatterns.factoryDesignPattern.components.dropdown.DropDown;
import com.lld.designpatterns.factoryDesignPattern.components.menu.AndroidMenu;
import com.lld.designpatterns.factoryDesignPattern.components.menu.menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
