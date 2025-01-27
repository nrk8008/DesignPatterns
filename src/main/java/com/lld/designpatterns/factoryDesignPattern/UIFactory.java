package com.lld.designpatterns.factoryDesignPattern;

import com.lld.designpatterns.factoryDesignPattern.components.button.Button;
import com.lld.designpatterns.factoryDesignPattern.components.dropdown.DropDown;
import com.lld.designpatterns.factoryDesignPattern.components.menu.menu;

public interface UIFactory {
    Button createButton();
    menu createMenu();
    DropDown createDropDown();

}
