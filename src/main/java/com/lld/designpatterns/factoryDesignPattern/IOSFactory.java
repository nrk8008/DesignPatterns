package com.lld.designpatterns.factoryDesignPattern;

import com.lld.designpatterns.factoryDesignPattern.components.button.Button;
import com.lld.designpatterns.factoryDesignPattern.components.button.IOSButton;
import com.lld.designpatterns.factoryDesignPattern.components.dropdown.DropDown;
import com.lld.designpatterns.factoryDesignPattern.components.dropdown.IOSDropDown;
import com.lld.designpatterns.factoryDesignPattern.components.menu.IOSMenu;
import com.lld.designpatterns.factoryDesignPattern.components.menu.menu;

public class IOSFactory implements UIFactory{


    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropDown();
    }

}
