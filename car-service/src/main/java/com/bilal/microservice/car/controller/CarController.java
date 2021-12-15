package com.bilal.microservice.car.controller;


import com.bilal.microservice.car.entity.Car;
import com.bilal.microservice.car.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cars")
@Slf4j
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/")
    public Car saveUser(@RequestBody Car car){
        log.info("insert user ");
        return carService.saveUser(car);
    }

    @GetMapping("/{id}")
    public Optional<Car> findUser(@PathVariable("id") int carId){
        log.info("insert user ");
        return carService.findUser(carId);
    }

}
