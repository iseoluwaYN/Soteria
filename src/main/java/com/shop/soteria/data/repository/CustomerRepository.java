package com.shop.soteria.data.repository;

import com.shop.soteria.data.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface CustomerRepository extends JpaRepository <Customer, Long> {

}
