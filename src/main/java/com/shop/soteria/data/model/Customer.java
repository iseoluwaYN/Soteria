package com.shop.soteria.data.model;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Customer extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
