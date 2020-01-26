package org.sid.designpatterns.creational.factory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactoryMain {

    @GetMapping("/factorypattern/{carType}")
    public ResponseEntity<String> makeCar(@PathVariable String carType) {
        if ("small".equals(carType)) {
            CarFactory.buildCar(CarType.SMALL);
        } else if ("sedan".equals(carType)) {
            Car car = CarFactory.buildCar(CarType.SEDAN);
            car.construct();
        } else if ("luxury".equals(carType)) {
            CarFactory.buildCar(CarType.LUXURY);
        }
        return new ResponseEntity("factory design pattern", HttpStatus.OK);

    }
}
