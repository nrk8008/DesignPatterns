package com.lld.designpatterns.strateyDesignPattern;

public class GoogleMaps {
    public void findPath(String from, String to, String mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorStrategy(mode);
        pathCalculatorStrategy.findPath(from, to);
    }
}
