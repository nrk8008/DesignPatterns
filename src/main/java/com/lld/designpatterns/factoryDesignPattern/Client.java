package com.lld.designpatterns.factoryDesignPattern;

import com.lld.designpatterns.factoryDesignPattern.components.button.Button;
import com.lld.designpatterns.factoryDesignPattern.components.dropdown.DropDown;
import com.lld.designpatterns.factoryDesignPattern.constants.Platform;

import static com.lld.designpatterns.factoryDesignPattern.constants.Platform.*;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Windows);
        Button button = uiFactory.createButton();
        DropDown dropDown = uiFactory.createDropDown();
        button.showButton();
        button.clickButton();

        dropDown.showDropDown();
        dropDown.collapseDropDown();

    }
}
