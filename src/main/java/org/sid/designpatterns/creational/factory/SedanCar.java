package org.sid.designpatterns.creational.factory;

public class SedanCar extends Car {

    public SedanCar() {
        super(CarType.SEDAN);
    }

    @Override
    public void construct() {
        System.out.println("building sedan car");
    }
}
