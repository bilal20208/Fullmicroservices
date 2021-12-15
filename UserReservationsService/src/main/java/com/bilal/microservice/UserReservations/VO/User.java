package com.bilal.microservice.UserReservations.VO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int userId;
    private String fName;
    private String lName;
    private String phone;
    private String email;
    private String country;
    private String drivingLicense ;
    private String IDNumber ;
}
