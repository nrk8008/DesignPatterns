package com.lld.designpatterns.strateyDesignPattern;

public class CarPathCalculator implements PathCalculatorStrategy{

    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Car Path" +" From "+ fromLocation+" To "+ toLocation);
    }
}
