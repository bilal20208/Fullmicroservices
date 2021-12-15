package com.bilal.microservice.reservationservice.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.ws.rs.POST;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

@RestController
public class reservation {

    @PostMapping("/reservation")
    public String reservationCarForUser(@RequestBody Map<String, Object> reservationdata) throws URISyntaxException, ParseException {
        String createPersonUrl = "http://localhost:8082/spring-rest/createPerson";
        RestTemplate restTemplate = new RestTemplate();

        final String baseUrl = "http://127.0.0.1:5053/user-reservations/";
        URI uri = new URI(baseUrl);
        DateFormat df =new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

        java.sql.Date toData = new java.sql.Date(df.parse((String) reservationdata.get("toData")).getTime());
        java.sql.Date fromData = new java.sql.Date(df.parse((String) reservationdata.get("fromData")).getTime());
        System.out.println(toData);

        UserReservations userReservations = new UserReservations(0,(int)reservationdata.get("user_id"),(int)reservationdata.get("car_id"),(int)reservationdata.get("branch_id"),(int)reservationdata.get("branch_id"),(int)reservationdata.get("price"), toData , fromData);

        ResponseEntity<String> result = restTemplate.postForEntity(uri, userReservations, String.class);
        return "reservation Successfuly";
    }

    @AllArgsConstructor

    @Data
    public class UserReservations {
        private int id;
        private int user_id;
        private int car_id;
        private int branch_id;
        private int payment_id;
        private float price;
        private java.sql.Date to_data;
        private java.sql.Date from_data;

    }
}
