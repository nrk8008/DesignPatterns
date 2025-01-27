package com.lld.designpatterns.factoryDesignPattern;

import com.lld.designpatterns.factoryDesignPattern.constants.Platform;

import static com.lld.designpatterns.factoryDesignPattern.constants.Platform.*;

public class Flutter {
    // Non-factory methods.

    void refreshingUI(){
        System.out.println("Refreshing the UI");
    }
    void setTheme(){
        System.out.println("Setting theme");
    }

    UIFactory getUIFactory(Platform platform){
        return UIFactoryFactory.getUIFactoryForPlatform(platform);
    }


}
