package com.bilal.microservice.User.repository;

import com.bilal.microservice.User.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User ,Integer> {


}
