package org.sid.designpatterns.creational.factory;

public class SmallCar extends Car {

    SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println(" building small cars");
    }
}
