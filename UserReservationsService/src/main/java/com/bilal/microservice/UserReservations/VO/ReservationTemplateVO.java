package com.bilal.microservice.UserReservations.VO;

import com.bilal.microservice.UserReservations.entity.UserReservations;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationTemplateVO {

    private UserReservations userReservations;
    private User user;
    private Car car;

}
