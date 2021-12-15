package com.bilal.microservice.api.Gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {


    @GetMapping("/userServiceFallBack")
    public String userServiceFallBack(){
    return "User Servic is Down."+
            "please try again later";
    }

    @GetMapping("/carServiceFallBack")
    public String carServiceFallBack(){
        return "car Servic is Down."+
                "please try again later";
    }

    @GetMapping("/userReservationsServiceFallBack")
    public String userReservationsServiceFallBack(){
        return "userReservations Servic is Down."+
                "please try again later";
    }

    @GetMapping("/reservationServiceFallBack")
    public String reservationServiceFallBack(){
        return "Reservation Servic is Down."+
                "please try again later";
    }
}
