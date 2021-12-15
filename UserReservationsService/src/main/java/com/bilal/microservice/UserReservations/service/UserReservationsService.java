package com.bilal.microservice.UserReservations.service;

import com.bilal.microservice.UserReservations.VO.Car;
import com.bilal.microservice.UserReservations.VO.ReservationTemplateVO;
import com.bilal.microservice.UserReservations.VO.User;
import com.bilal.microservice.UserReservations.entity.UserReservations;
import com.bilal.microservice.UserReservations.repository.UserReservationsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserReservationsService {

    @Autowired
    private UserReservationsRepository userReservationsRepository;

    @Autowired
    private RestTemplate restTemplate;

    public UserReservations saveUser(UserReservations userR) {
        return userReservationsRepository.save(userR);
    }

    public Optional<UserReservations> findUser(int userId) {
        return userReservationsRepository.findById(userId);
    }

    public ReservationTemplateVO getreservationWithUserAndCar(int urId) {
        ReservationTemplateVO reservationTemplateVO = new ReservationTemplateVO();
        UserReservations userReservations = userReservationsRepository.findById(urId).orElseThrow(null);
        User user = restTemplate.getForObject("http://USER-SERVICE/users/2", User.class);
        Car car = restTemplate.getForObject("http://CAR-SERVICE/cars/1" , Car.class);
        reservationTemplateVO.setUserReservations(userReservations);
        reservationTemplateVO.setUser(user);
        reservationTemplateVO.setCar(car);
        return reservationTemplateVO;
    }
}
