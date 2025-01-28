package com.lld.designpatterns.strateyDesignPattern;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Walk Path" + " from: " + fromLocation + " to: " + toLocation);
    }
}
