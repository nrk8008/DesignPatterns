package com.lld.designpatterns.factoryDesignPattern;

import com.lld.designpatterns.factoryDesignPattern.components.button.Button;
import com.lld.designpatterns.factoryDesignPattern.components.button.WindowsButton;
import com.lld.designpatterns.factoryDesignPattern.components.dropdown.DropDown;
import com.lld.designpatterns.factoryDesignPattern.components.dropdown.WindowsDropDown;
import com.lld.designpatterns.factoryDesignPattern.components.menu.menu;
import com.lld.designpatterns.factoryDesignPattern.components.menu.WindowsMenu;

public class windowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }
}
