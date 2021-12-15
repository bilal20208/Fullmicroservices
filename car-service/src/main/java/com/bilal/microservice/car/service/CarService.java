package com.bilal.microservice.car.service;

import com.bilal.microservice.car.entity.Car;
import com.bilal.microservice.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Car saveUser(Car user) {
        return carRepository.save(user);
    }

    public Optional<Car> findUser(int userId) {
        return carRepository.findById(userId);
    }
}
