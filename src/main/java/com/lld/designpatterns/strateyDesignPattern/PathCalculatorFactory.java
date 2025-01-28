package com.lld.designpatterns.strateyDesignPattern;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorStrategy(String mode) {
        if(mode.equals("Bike")){
            return new BikePathCalculator();
        }
        else if(mode.equals("Car")){
            return new CarPathCalculator();
        }
        else{
            return new WalkPathCalculator();
        }
    }
}
