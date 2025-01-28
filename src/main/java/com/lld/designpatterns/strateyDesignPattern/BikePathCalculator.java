package com.lld.designpatterns.strateyDesignPattern;

public class BikePathCalculator implements PathCalculatorStrategy{

    @Override
    public void findPath(String fromLocation, String toLocation) {
        System.out.println("Bike Path"+" From location: "+fromLocation+" To location: "+toLocation);
    }
}
