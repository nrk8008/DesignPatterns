package com.lld.designpatterns.factoryDesignPattern;

import com.lld.designpatterns.factoryDesignPattern.constants.Platform;

public class UIFactoryFactory {

    public static UIFactory getUIFactoryForPlatform(Platform platform) {
        if(platform.equals(platform.Android )){
            return new AndroidFactory();
        }
        if(platform.equals(Platform.IOS)){
            return new IOSFactory();
        }
        if(platform.equals(platform.Windows)){
            return new windowsFactory();
        }
        return (UIFactory) new RuntimeException("Invalid Platform");
    }
}
