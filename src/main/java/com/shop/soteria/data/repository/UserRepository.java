package com.shop.soteria.data.repository;

import com.shop.soteria.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, Long> {

}
