package com.bilal.microservice.UserReservations.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private int carId;
    private String name;
    private String brand;
    private String color;
    private int doorNumber;
    private float pricePerHour;
    private String Descriptions ;
}
