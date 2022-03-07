package com.shop.soteria.data.model;

import com.sun.istack.NotNull;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String email;
    private String password;
}
