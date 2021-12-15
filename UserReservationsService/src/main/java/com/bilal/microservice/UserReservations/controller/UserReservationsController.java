package com.bilal.microservice.UserReservations.controller;


import com.bilal.microservice.UserReservations.VO.ReservationTemplateVO;
import com.bilal.microservice.UserReservations.entity.UserReservations;
import com.bilal.microservice.UserReservations.service.UserReservationsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user-reservations")
@Slf4j
public class UserReservationsController {

    @Autowired
    private UserReservationsService userReservationsService;

    @PostMapping("/")
    public UserReservations saveUser(@RequestBody UserReservations userR){
        log.info("insert user ");
        return userReservationsService.saveUser(userR);
    }

    /*@GetMapping("/{id}")
    public Optional<UserReservations> findUser(@PathVariable("id") int urId){
        log.info("insert user ");
        return userReservationsService.findUser(urId);
    }*/

    @GetMapping("/{id}")
    public ReservationTemplateVO getreservationWithUserAndCar(@PathVariable("id") int urId){
        return userReservationsService.getreservationWithUserAndCar(urId);
    }

}
