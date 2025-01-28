package com.lld.designpatterns.strateyDesignPattern;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Mahabubnagar", "Kachiguda", "Walk");
    }
}
