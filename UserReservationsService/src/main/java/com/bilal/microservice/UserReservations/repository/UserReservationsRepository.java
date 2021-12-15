package com.bilal.microservice.UserReservations.repository;


import com.bilal.microservice.UserReservations.entity.UserReservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReservationsRepository extends JpaRepository<UserReservations,Integer> {


}
